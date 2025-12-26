package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AllocationSnapshotRecord {

    @Id
    private String id;

    private String investorId;
    private LocalDateTime snapshotDate;
    private Double totalPortfolioValue;

    @Lob
    private String allocationJson;

    public AllocationSnapshotRecord() {}

    public AllocationSnapshotRecord(String investorId, LocalDateTime date,
                                    Double value, String json) {
        this.id = investorId + "-" + date;
        this.investorId = investorId;
        this.snapshotDate = date;
        this.totalPortfolioValue = value;
        this.allocationJson = json;
    }

    public String getInvestorId() { return investorId; }
    public LocalDateTime getSnapshotDate() { return snapshotDate; }
    public Double getTotalPortfolioValue() { return totalPortfolioValue; }
}
