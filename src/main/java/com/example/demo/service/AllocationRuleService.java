package com.example.demo.service;

import com.example.demo.entity.AssetClassAllocationRule;
import java.util.List;

public interface AllocationRuleService {

    AssetClassAllocationRule save(AssetClassAllocationRule rule);

    AssetClassAllocationRule update(String id, AssetClassAllocationRule rule);

    List<AssetClassAllocationRule> getByInvestorId(String investorId);
}
