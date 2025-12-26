package com.example.demo.repository;

import com.example.demo.entity.RebalancingAlertRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RebalancingAlertRepository
        extends JpaRepository<RebalancingAlertRecord, Long> {

    // fetch alerts by investorId (TYPE MUST MATCH ENTITY)
    List<RebalancingAlertRecord> findByInvestorId(Long investorId);
}
