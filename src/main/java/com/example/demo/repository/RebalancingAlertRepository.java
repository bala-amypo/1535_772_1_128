package com.example.demo.repository;

import com.example.demo.entity.RebalancingAlertRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface AssetClassAllocationRuleRepository
        extends JpaRepository<AssetClassAllocationRule, Long> {

    List<AssetClassAllocationRule> findByInvestorId(Long investorId);
}
