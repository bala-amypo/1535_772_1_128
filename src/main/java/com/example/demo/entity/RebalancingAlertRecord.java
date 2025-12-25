package com.example.demo.entity;

import com.example.demo.entity.enums.AssetClassType;
import jakarta.persistence.*;

@Entity
public class RebalancingAlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String investorId;

    @Enumerated(EnumType.STRING)
    private AssetClassType assetClass;

    private Double currentPercentage;
    private Boolean resolved = false;

    public RebalancingAlertRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getInvestorId() { return investorId; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }

    public AssetClassType getAssetClass() { return assetClass; }
    public void setAssetClass(AssetClassType assetClass) { this.assetClass = assetClass; }

    public Double getCurrentPercentage() { return currentPercentage; }
    public void setCurrentPercentage(Double currentPercentage) {
        this.currentPercentage = currentPercentage;
    }

    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean resolved) { this.resolved = resolved; }
}
