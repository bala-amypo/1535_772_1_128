package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.AssetClassAllocationRule;

public interface AssetClassAllocationRuleService {

    AssetClassAllocationRule save(AssetClassAllocationRule rule);

    List<AssetClassAllocationRule> getAll();

    AssetClassAllocationRule getById(Long id);

    void delete(Long id);
}
