package com.example.demo.service;

import com.example.demo.model.AssetClassAllocationRuleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetClassAllocationRuleServiceImpl
        implements AssetClassAllocationRuleService {

    @Override
    public AssetClassAllocationRuleModel create(
            AssetClassAllocationRuleModel model) {
        return model;
    }

    @Override
    public List<AssetClassAllocationRuleModel> getByInvestor(
            Long investorId) {
        return new ArrayList<>();
    }
}
