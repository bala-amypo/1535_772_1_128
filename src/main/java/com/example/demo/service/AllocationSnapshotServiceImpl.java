package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.entity.enums.AssetClassType;
import com.example.demo.entity.enums.AlertSeverity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.AllocationSnapshotService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AllocationSnapshotServiceImpl implements AllocationSnapshotService {

    private final AllocationSnapshotRecordRepository snapshotRepo;
    private final HoldingRecordRepository holdingRepo;
    private final AssetClassAllocationRuleRepository ruleRepo;
    private final RebalancingAlertRecordRepository alertRepo;

    public AllocationSnapshotServiceImpl(
            AllocationSnapshotRecordRepository snapshotRepo,
            HoldingRecordRepository holdingRepo,
            AssetClassAllocationRuleRepository ruleRepo,
            RebalancingAlertRecordRepository alertRepo) {
        this.snapshotRepo = snapshotRepo;
        this.holdingRepo = holdingRepo;
        this.ruleRepo = ruleRepo;
        this.alertRepo = alertRepo;
    }

    @Override
    public AllocationSnapshotRecord computeSnapshot(Long investorId) {
        List<HoldingRecord> holdings = holdingRepo.findByInvestorId(investorId);
        if (holdings.isEmpty()) {
            throw new IllegalArgumentException("No holdings");
        }

        double total = holdings.stream().mapToDouble(HoldingRecord::getCurrentValue).sum();
        if (total <= 0) {
            throw new IllegalArgumentException("must be > 0");
        }

        Map<AssetClassType, Double> allocation = new EnumMap<>(AssetClassType.class);
        for (HoldingRecord h : holdings) {
            allocation.merge(h.getAssetClass(), h.getCurrentValue(), Double::sum);
        }

        Map<String, Double> percentMap = new HashMap<>();
        allocation.forEach((k, v) ->
                percentMap.put(k.name(), (v / total) * 100));

        AllocationSnapshotRecord snapshot = new AllocationSnapshotRecord();
        snapshot.setInvestorId(investorId);
        snapshot.setTotalPortfolioValue(total);

        try {
            snapshot.setAllocationJson(new ObjectMapper().writeValueAsString(percentMap));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        snapshotRepo.save(snapshot);

        ruleRepo.findActiveRulesHql(investorId).forEach(rule -> {
            double current = percentMap.getOrDefault(rule.getAssetClass().name(), 0.0);
            if (current > rule.getTargetPercentage()) {
                RebalancingAlertRecord alert = new RebalancingAlertRecord();
                alert.setInvestorId(investorId);
                alert.setAssetClass(rule.getAssetClass());
                alert.setCurrentPercentage(current);
                alert.setTargetPercentage(rule.getTargetPercentage());
                alert.setSeverity(AlertSeverity.HIGH);
                alert.setMessage("Rebalancing required");
                alertRepo.save(alert);
            }
        });

        return snapshot;
    }

    @Override
    public AllocationSnapshotRecord getSnapshotById(Long id) {
        return snapshotRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Snapshot not found"));
    }

    @Override
    public List<AllocationSnapshotRecord> getSnapshotsByInvestor(Long investorId) {
        return snapshotRepo.findAll();
    }

    @Override
    public List<AllocationSnapshotRecord> getAllSnapshots() {
        return snapshotRepo.findAll();
    }
}
