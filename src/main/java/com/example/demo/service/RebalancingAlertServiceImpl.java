package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.repository.RebalancingAlertRepository;

@Service
public class RebalancingAlertServiceImpl implements RebalancingAlertService {

    private final RebalancingAlertRepository repository;

    public RebalancingAlertServiceImpl(RebalancingAlertRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RebalancingAlertRecord> getAlerts(Long investorId) {
        return repository.findByInvestorId(investorId);
    }
}
