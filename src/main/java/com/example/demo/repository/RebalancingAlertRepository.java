package com.example.demo.repository;

import com.example.demo.entity.RebalancingAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebalancingAlertRepository
        extends JpaRepository<RebalancingAlert, Long> {
}
