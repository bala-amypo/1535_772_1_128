package com.example.demo.service;

import com.example.demo.entity.AssetClassAllocationRuleService ;
import java.util.List;

public interface AssetClassAllocationRuleService   {
    AssetClassAllocationRule createRule(AssetClassAllocationRuleService  rule);
    ListAssetClassAllocationRuleService > getRulesByInvestor(Long investorId);
}
