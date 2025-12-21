package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private Double currentValue;

    // getters & setters
    public Long getId() { return id; }
    public Long getInvestorId() { return investorId; }
    public AssetClass getAssetClass() { return assetClass; }
    public Double getCurrentValue() { return currentValue; }

    public void setId(Long id) { this.id = id; }
    public void setInvestorId(Long investorId) { this.investorId = investorId; }
    public void setAssetClass(AssetClass assetClass) { this.assetClass = assetClass; }
    public void setCurrentValue(Double currentValue) { this.currentValue = currentValue; }
}
