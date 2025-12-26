package com.example.demo.service;

import com.example.demo.entity.AssetAllocationRule;
import java.util.List;

public interface AssetAllocationRuleService {

    AssetAllocationRule create(AssetAllocationRule rule);

    List<AssetAllocationRule> getAll();

    AssetAllocationRule getById(Long id);

    AssetAllocationRule update(Long id, AssetAllocationRule rule);

    void delete(Long id);
}
