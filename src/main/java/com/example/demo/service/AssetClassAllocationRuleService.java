package com.example.demo.service;

import com.example.demo.model.AssetClassAllocationRuleModel;
import java.util.List;

public interface AssetClassAllocationRuleService {

    AssetClassAllocationRuleModel create(
            AssetClassAllocationRuleModel model);

    List<AssetClassAllocationRuleModel> getByInvestor(
            Long investorId);
}
