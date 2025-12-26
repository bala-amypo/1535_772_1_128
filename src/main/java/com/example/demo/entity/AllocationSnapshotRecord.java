package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "allocation_snapshot")
public class AllocationSnapshotRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String investorId;

    private double totalPortfolioValue;

    private LocalDateTime snapshotDate;

    public AllocationSnapshotRecord() {
    }

    public AllocationSnapshotRecord(String investorId, double totalPortfolioValue, LocalDateTime snapshotDate) {
        this.investorId = investorId;
        this.totalPortfolioValue = totalPortfolioValue;
        this.snapshotDate = snapshotDate;
    }

    public Long getId() {
        return id;
    }

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public double getTotalPortfolioValue() {
        return totalPortfolioValue;
    }

    public void setTotalPortfolioValue(double totalPortfolioValue) {
        this.totalPortfolioValue = totalPortfolioValue;
    }

    public LocalDateTime getSnapshotDate() {
        return snapshotDate;
    }

    public void setSnapshotDate(LocalDateTime snapshotDate) {
        this.snapshotDate = snapshotDate;
    }
}
