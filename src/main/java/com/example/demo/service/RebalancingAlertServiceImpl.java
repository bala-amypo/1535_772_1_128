package com.example.demo.service.impl;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.RebalancingAlertRecordRepository;
import com.example.demo.service.RebalancingAlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebalancingAlertServiceImpl implements RebalancingAlertService {

    private final RebalancingAlertRecordRepository repository;

    public RebalancingAlertServiceImpl(RebalancingAlertRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public RebalancingAlertRecord save(RebalancingAlertRecord alert) {
        return repository.save(alert);
    }

    @Override
    public List<RebalancingAlertRecord> getByInvestorId(String investorId) {
        return repository.findByInvestorId(investorId);
    }

    @Override
    public RebalancingAlertRecord resolve(String id) {
        RebalancingAlertRecord alert = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Alert not found: " + id));
        alert.setResolved(true);
        return repository.save(alert);
    }
}
