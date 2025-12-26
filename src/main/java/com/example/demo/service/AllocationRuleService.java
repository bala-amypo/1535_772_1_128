package com.example.demo.service;

import com.example.demo.entity.AssetClassAllocationRule;

import java.util.List;

public interface AllocationRuleService {

    AssetClassAllocationRule createRule(AssetClassAllocationRule rule);

    AssetClassAllocationRule updateRule(String id, AssetClassAllocationRule rule);

    List<AssetClassAllocationRule> getRulesByInvestor(String investorId);
}
