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

    public RebalancingAlertRecord save(RebalancingAlertRecord record) {
        return repo.save(record);
    }

    public List<RebalancingAlertRecord> getByInvestorId(String investorId) {
        return repo.findByInvestorId(investorId);
    }

    public RebalancingAlertRecord resolve(Long id) {
        RebalancingAlertRecord r = repo.findById(id).orElseThrow();
        r.setResolved(true);
        return repo.save(r);
    }
}
