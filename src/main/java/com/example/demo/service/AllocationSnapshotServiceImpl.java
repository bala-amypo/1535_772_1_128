package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.entity.enums.AlertSeverity;
import com.example.demo.entity.enums.AssetClassType;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.AllocationSnapshotService;
import com.example.demo.util.AllocationUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class AllocationSnapshotServiceImpl implements AllocationSnapshotService {

    private final AllocationSnapshotRecordRepository snapshotRepo;
    private final HoldingRecordRepository holdingRepo;
    private final AssetClassAllocationRuleRepository ruleRepo;
    private final RebalancingAlertRecordRepository alertRepo;

    // ⚠️ Constructor order MUST match test
    public AllocationSnapshotServiceImpl(
            AllocationSnapshotRecordRepository snapshotRepo,
            HoldingRecordRepository holdingRepo,
            AssetClassAllocationRuleRepository ruleRepo,
            RebalancingAlertRecordRepository alertRepo
    ) {
        this.snapshotRepo = snapshotRepo;
        this.holdingRepo = holdingRepo;
        this.ruleRepo = ruleRepo;
        this.alertRepo = alertRepo;
    }

    @Override
    public AllocationSnapshotRecord computeSnapshot(Long investorId) {

        List<HoldingRecord> holdings = holdingRepo.findByInvestorId(investorId);

        if (holdings == null || holdings.isEmpty()) {
            throw new IllegalArgumentException("No holdings for investor");
        }

        double totalValue = holdings.stream()
                .mapToDouble(HoldingRecord::getCurrentValue)
                .sum();

        if (totalValue <= 0) {
            throw new IllegalArgumentException("Total portfolio value must be > 0");
        }

        // % allocation per asset class
        Map<AssetClassType, Double> allocationMap =
                AllocationUtils.calculateAllocationPercentages(holdings, totalValue);

        String allocationJson = allocationMap.toString();

        AllocationSnapshotRecord snapshot = new AllocationSnapshotRecord(
                investorId,
                LocalDateTime.now(),
                totalValue,
                allocationJson
        );

        snapshotRepo.save(snapshot);

        // 🔔 Alerts
        List<AssetClassAllocationRule> rules =
                ruleRepo.findByInvestorIdAndActiveTrue(investorId);

        for (AssetClassAllocationRule rule : rules) {
            AssetClassType assetClass = rule.getAssetClass();
            double target = rule.getTargetPercentage();
            double current = allocationMap.getOrDefault(assetClass, 0.0);

            if (current > target) {
                RebalancingAlertRecord alert = new RebalancingAlertRecord(
                        investorId,
                        assetClass,
                        current,
                        target,
                        AlertSeverity.MEDIUM,
                        "Rebalancing required for " + assetClass,
                        LocalDateTime.now(),
                        false
                );
                alertRepo.save(alert);
            }
        }

        return snapshot;
    }

    @Override
    public AllocationSnapshotRecord getSnapshotById(Long id) {
        return snapshotRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Snapshot not found: " + id));
    }

    @Override
    public List<AllocationSnapshotRecord> getSnapshotsByInvestor(Long investorId) {
        return snapshotRepo.findAll()
                .stream()
                .filter(s -> s.getInvestorId().equals(investorId))
                .collect(Collectors.toList());
    }

    @Override
    public List<AllocationSnapshotRecord> getAllSnapshots() {
        return snapshotRepo.findAll();
    }
}
