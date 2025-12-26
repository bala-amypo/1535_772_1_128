package com.example.demo.repository;

import com.example.demo.entity.RebalancingAlertRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RebalancingAlertRepository
        extends JpaRepository<RebalancingAlertRecord, String> {

    List<RebalancingAlertRecord> findByInvestorId(String investorId);
}
