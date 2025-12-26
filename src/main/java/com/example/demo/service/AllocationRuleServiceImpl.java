package com.example.demo.service.impl;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AssetClassAllocationRuleRepository;
import com.example.demo.service.AllocationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AssetClassAllocationRuleRepository repository;

    public AllocationRuleServiceImpl(AssetClassAllocationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AssetClassAllocationRule save(AssetClassAllocationRule rule) {
        return repository.save(rule);
    }

    @Override
    public AssetClassAllocationRule update(String id, AssetClassAllocationRule rule) {
        AssetClassAllocationRule existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found: " + id));

        existing.setTargetPercentage(rule.getTargetPercentage());
        existing.setActive(rule.getActive());
        return repository.save(existing);
    }

    @Override
    public List<AssetClassAllocationRule> getByInvestorId(String investorId) {
        return repository.findByInvestorId(investorId);
    }
}
