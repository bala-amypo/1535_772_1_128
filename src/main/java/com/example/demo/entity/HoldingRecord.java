package com.example.demo.entity;

import com.example.demo.entity.enums.AssetClassType;
import jakarta.persistence.*;

@Entity
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String investorId;

    @Enumerated(EnumType.STRING)
    private AssetClassType assetClass;

    private Double currentValue;

    public HoldingRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getInvestorId() { return investorId; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }

    public AssetClassType getAssetClass() { return assetClass; }
    public void setAssetClass(AssetClassType assetClass) { this.assetClass = assetClass; }

    public Double getCurrentValue() { return currentValue; }
    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
