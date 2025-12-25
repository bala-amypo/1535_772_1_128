package com.example.demo.service;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.repository.RebalancingAlertRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebalancingAlertServiceImpl implements RebalancingAlertService {

    private final RebalancingAlertRepository repo;

    public RebalancingAlertServiceImpl(RebalancingAlertRepository repo) {
        this.repo = repo;
    }

    @Override
    public RebalancingAlertRecord save(RebalancingAlertRecord alert) {
        return repo.save(alert);
    }

    @Override
    public List<RebalancingAlertRecord> getByInvestorId(String investorId) {
        return repo.findByInvestorId(investorId);
    }
}
