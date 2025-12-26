package com.example.demo.service.impl;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AssetClassAllocationRuleRepository;
import com.example.demo.service.AllocationRuleService;

import java.util.List;

public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AssetClassAllocationRuleRepository repository;

    public AllocationRuleServiceImpl(AssetClassAllocationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AssetClassAllocationRule createRule(AssetClassAllocationRule rule) {
        validate(rule.getTargetPercentage());
        return repository.save(rule);
    }

    @Override
    public AssetClassAllocationRule updateRule(Long id, AssetClassAllocationRule updatedRule) {
        AssetClassAllocationRule existing = getRuleById(id);
        validate(updatedRule.getTargetPercentage());

        existing.setAssetClass(updatedRule.getAssetClass());
        existing.setTargetPercentage(updatedRule.getTargetPercentage());
        existing.setActive(updatedRule.getActive());

        return repository.save(existing);
    }

    @Override
    public List<AssetClassAllocationRule> getRulesByInvestor(Long investorId) {
        return repository.findByInvestorId(investorId);
    }

    @Override
    public List<AssetClassAllocationRule> getActiveRules(Long investorId) {
        return repository.findActiveRulesHql(investorId);
    }

    @Override
    public AssetClassAllocationRule getRuleById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Rule not found: " + id));
    }

    @Override
    public List<AssetClassAllocationRule> getAllRules() {
        return repository.findAll();
    }

    private void validate(Double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("between 0 and 100");
        }
    }
}
