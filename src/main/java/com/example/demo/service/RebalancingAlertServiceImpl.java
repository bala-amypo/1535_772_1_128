package com.example.demo.service;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.repository.RebalancingAlertRecordRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RebalancingAlertServiceImpl implements RebalancingAlertService {

    private final RebalancingAlertRecordRepository repo;

    public RebalancingAlertServiceImpl(RebalancingAlertRecordRepository repo) {
        this.repo = repo;
    }

    public List<RebalancingAlertRecord> getAlerts(Long investorId) {
        return repo.findByInvestorId(investorId);
    }

    public RebalancingAlertRecord resolveAlert(Long alertId) {
        RebalancingAlertRecord alert = repo.findById(alertId).orElseThrow();
        alert.setResolved(true);
        return repo.save(alert);
    }
}
