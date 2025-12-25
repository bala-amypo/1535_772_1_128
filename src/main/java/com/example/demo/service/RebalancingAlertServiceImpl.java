package com.example.demo.service;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.repository.RebalancingAlertRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebalancingAlertServiceImpl
        implements RebalancingAlertService {

    private final RebalancingAlertRecordRepository repo;

    public RebalancingAlertServiceImpl(
            RebalancingAlertRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public RebalancingAlertRecord save(
            RebalancingAlertRecord record) {
        return repo.save(record);
    }

    @Override
    public List<RebalancingAlertRecord> getByInvestorId(
            Long investorId) {
        return repo.findByInvestorId(investorId);
    }
}
