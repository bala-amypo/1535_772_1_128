package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AssetClassAllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetClass;

    @Min(0) @Max(100)
    private Double targetPercentage;

    @ManyToOne
    private InvestorProfile investor;


    // getters & setters
    public Long getId() { return id; }
    public Long getInvestorId() { return investorId; }
    public AssetClass getAssetClass() { return assetClass; }
    public Double getTargetPercentage() { return targetPercentage; }

    public void setId(Long id) { this.id = id; }
    public void setInvestorId(Long investorId) { this.investorId = investorId; }
    public void setAssetClass(AssetClass assetClass) { this.assetClass = assetClass; }
    public void setTargetPercentage(Double targetPercentage) { this.targetPercentage = targetPercentage; }
}
