package com.example.demo.entity;

import com.example.demo.entity.enums.AssetClassType;
import jakarta.persistence.*;

@Entity
public class AssetClassAllocationRule {

    @Id
    private String id;

    private String investorId;

    @Enumerated(EnumType.STRING)
    private AssetClassType assetClass;

    private Double targetPercentage;
    private Boolean active;

    public AssetClassAllocationRule() {}

    public AssetClassAllocationRule(String investorId, AssetClassType assetClass,
                                    Double targetPercentage, Boolean active) {
        this.id = investorId + "-" + assetClass;
        this.investorId = investorId;
        this.assetClass = assetClass;
        this.targetPercentage = targetPercentage;
        this.active = active;
    }

    public String getId() { return id; }
    public String getInvestorId() { return investorId; }
    public AssetClassType getAssetClass() { return assetClass; }
    public Double getTargetPercentage() { return targetPercentage; }
    public Boolean getActive() { return active; }

    public void setTargetPercentage(Double v) { this.targetPercentage = v; }
}
