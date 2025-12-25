package com.example.demo.service;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.repository.AssetClassAllocationRuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetClassAllocationRuleServiceImpl
        implements AssetClassAllocationRuleService {

    private final AssetClassAllocationRuleRepository repo;

    public AssetClassAllocationRuleServiceImpl(
            AssetClassAllocationRuleRepository repo) {
        this.repo = repo;
    }

    @Override
    public AssetClassAllocationRule save(AssetClassAllocationRule rule) {
        return repo.save(rule);
    }

    @Override
    public List<AssetClassAllocationRule> getByInvestorId(Long investorId) {
        return repo.findByInvestorId(investorId);
    }
}
