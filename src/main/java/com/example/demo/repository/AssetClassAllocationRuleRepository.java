package com.example.demo.repository;

import com.example.demo.entity.AssetClassAllocationRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetClassAllocationRuleRepository
        extends JpaRepository<AssetClassAllocationRule, String> {

    List<AssetClassAllocationRule> findByInvestorId(String investorId);

    // used in tests
    List<AssetClassAllocationRule> findByInvestorIdAndActiveTrue(String investorId);

    // mock HQL-style method
    List<AssetClassAllocationRule> findActiveRulesHql(String investorId);
}
