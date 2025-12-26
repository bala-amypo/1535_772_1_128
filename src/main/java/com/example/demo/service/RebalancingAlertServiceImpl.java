package com.example.demo.service;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.repository.RebalancingAlertRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebalancingAlertServiceImpl implements RebalancingAlertService {

    private final RebalancingAlertRepository repository;

    public RebalancingAlertServiceImpl(RebalancingAlertRepository repository) {
        this.repository = repository;
    }

    @Override
    public RebalancingAlertRecord save(RebalancingAlertRecord record) {
        return repository.save(record);
    }

    @Override
    public List<RebalancingAlertRecord> getByInvestorId(String investorId) {
        // ❌ OLD: repository.findByInvestorId(Long)
        // ✅ NEW:
        return repository.findByInvestorId(investorId);
    }
}
