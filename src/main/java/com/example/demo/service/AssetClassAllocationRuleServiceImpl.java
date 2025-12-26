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
    public AssetClassAllocationRule createRule(AssetClassAllocationRule rule) {
        if (rule.getTargetPercentage() < 0 || rule.getTargetPercentage() > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        return repository.save(rule);
    }

    @Override
    public AssetClassAllocationRule updateRule(String id, AssetClassAllocationRule updated) {
        AssetClassAllocationRule existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found: " + id));

        existing.setTargetPercentage(updated.getTargetPercentage());
        existing.setActive(updated.getActive());

        return repository.save(existing);
    }

    @Override
    public List<AssetClassAllocationRule> getRulesByInvestor(String investorId) {
        return repository.findByInvestorId(investorId);
    }
}
