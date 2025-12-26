package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.repository.AssetClassAllocationRuleRepository;

@Service
public class AssetClassAllocationRuleServiceImpl
        implements AssetClassAllocationRuleService {

    private final AssetClassAllocationRuleRepository repository;

    public AssetClassAllocationRuleServiceImpl(
            AssetClassAllocationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AssetClassAllocationRule save(AssetClassAllocationRule rule) {
        return repository.save(rule);
    }

    @Override
    public List<AssetClassAllocationRule> getAll() {
        return repository.findAll();
    }

    @Override
    public AssetClassAllocationRule getById(String investorId) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rule not found"));
    }

    @Override
    public void delete(String investorId) {
        repository.deleteById(id);
    }
}
