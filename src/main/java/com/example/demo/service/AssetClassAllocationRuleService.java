package com.example.demo.service;

import com.example.demo.entity.AssetClassAllocationRule;

import java.util.List;

public interface AssetClassAllocationRuleService {

    AssetClassAllocationRule save(AssetClassAllocationRule rule);

    List<AssetClassAllocationRule> getByInvestorId(Long investorId);
}
