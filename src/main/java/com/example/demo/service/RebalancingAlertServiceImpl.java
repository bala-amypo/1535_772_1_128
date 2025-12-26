package com.example.demo.service.impl;

import com.example.demo.entity.RebalancingAlert;
import com.example.demo.repository.RebalancingAlertRepository;
import com.example.demo.service.RebalancingAlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebalancingAlertServiceImpl implements RebalancingAlertService {

    private final RebalancingAlertRepository repository;

    public RebalancingAlertServiceImpl(RebalancingAlertRepository repository) {
        this.repository = repository;
    }

    @Override
    public RebalancingAlert create(RebalancingAlert alert) {
        return repository.save(alert);
    }

    @Override
    public List<RebalancingAlert> getAll() {
        return repository.findAll();
    }

    @Override
    public RebalancingAlert getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert not found"));
    }

    @Override
    public RebalancingAlert update(Long id, RebalancingAlert alert) {
        RebalancingAlert existing = getById(id);

        existing.setAssetName(alert.getAssetName());
        existing.setTargetAllocation(alert.getTargetAllocation());
        existing.setCurrentAllocation(alert.getCurrentAllocation());

        return repository.save(existing);
    }

    @Override
    public void evaluate(Long id) {
        RebalancingAlert alert = getById(id);

        double diff = Math.abs(
                alert.getCurrentAllocation() - alert.getTargetAllocation()
        );

        alert.setTriggered(diff >= 5.0); // 5% threshold
        repository.save(alert);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
