package com.example.demo.entity;

import jakarta.persistence.*;
import com.example.demo.entity.enums.AssetClassType;

private AssetClassType assetClass;

@Entity
@Table(name = "rebalancing_alert_records")
public class RebalancingAlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;
    private String message;

    public Long getId() { return id; }

    public Long getInvestorId() { return investorId; }
    public void setInvestorId(Long investorId) {
        this.investorId = investorId;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) {
        this.message = message;
    }
}
