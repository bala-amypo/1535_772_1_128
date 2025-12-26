package com.example.demo.repository;

import com.example.demo.entity.AssetAllocationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetAllocationRuleRepository
        extends JpaRepository<AssetAllocationRule, Long> {
}
