package com.example.demo.service.impl;

import com.example.demo.entity.AssetAllocationRule;
import com.example.demo.repository.AssetAllocationRuleRepository;
import com.example.demo.service.AssetAllocationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetAllocationRuleServiceImpl
        implements AssetAllocationRuleService {

    private final AssetAllocationRuleRepository repository;

    public AssetAllocationRuleServiceImpl(
            AssetAllocationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AssetAllocationRule create(AssetAllocationRule rule) {
        return repository.save(rule);
    }

    @Override
    public List<AssetAllocationRule> getAll() {
        return repository.findAll();
    }

    @Override
    public AssetAllocationRule getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Allocation rule not found"));
    }

    @Override
    public AssetAllocationRule update(Long id, AssetAllocationRule rule) {
        AssetAllocationRule existing = getById(id);

        existing.setAssetClass(rule.getAssetClass());
        existing.setMinAllocation(rule.getMinAllocation());
        existing.setMaxAllocation(rule.getMaxAllocation());
        existing.setActive(rule.getActive());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
