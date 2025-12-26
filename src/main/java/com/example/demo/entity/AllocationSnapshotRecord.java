package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AllocationSnapshotRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;
    private LocalDateTime snapshotDate;
    private Double totalPortfolioValue;

    @Column(length = 4000)
    private String allocationJson;

    public AllocationSnapshotRecord() {}

    public AllocationSnapshotRecord(Long investorId, LocalDateTime snapshotDate,
                                    Double totalPortfolioValue, String allocationJson) {
        this.investorId = investorId;
        this.snapshotDate = snapshotDate;
        this.totalPortfolioValue = totalPortfolioValue;
        this.allocationJson = allocationJson;
    }

    public Long getId() { return id; }

    public Long getInvestorId() { return investorId; }

    public LocalDateTime getSnapshotDate() { return snapshotDate; }

    public Double getTotalPortfolioValue() { return totalPortfolioValue; }

    public String getAllocationJson() { return allocationJson; }

    public void setInvestorId(Long investorId) { this.investorId = investorId; }
    public void setTotalPortfolioValue(double v) { this.totalPortfolioValue = v; }
    public void setAllocationJson(String j) { this.allocationJson = j; }
}
