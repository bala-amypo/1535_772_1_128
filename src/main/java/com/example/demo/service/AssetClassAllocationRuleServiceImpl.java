package com.example.demo.service;

import com.example.demo.entity.AssetClassAllocationRuleService ;
import com.example.demo.repository.AssetClassAllocationRuleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AssetClassAllocationRuleServiceImpl implements AssetClassAllocationRuleService  {

    private final AssetClassAllocationRuleRepository repo;

    public AllocationRuleServiceImpl(AssetClassAllocationRuleRepository repo) {
        this.repo = repo;
    }

    public AssetClassAllocationRuleService  createRule(AssetClassAllocationRuleService  rule) {
        return repo.save(rule);
    }

    public List<AssetClassAllocationRuleService > getRulesByInvestor(Long investorId) {
        return repo.findByInvestorId(investorId);
    }
}
