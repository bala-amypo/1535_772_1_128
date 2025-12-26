package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_class_allocation_rule")
public class AssetClassAllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "investor_id", nullable = false)
    private String investorId;

    private String assetClass;
    private Double minPercent;
    private Double maxPercent;

    public AssetClassAllocationRule() {}

    public AssetClassAllocationRule(String investorId, String assetClass,
                                    Double minPercent, Double maxPercent) {
        this.investorId = investorId;
        this.assetClass = assetClass;
        this.minPercent = minPercent;
        this.maxPercent = maxPercent;
    }

    public Long getId() { return id; }
    public String getInvestorId() { return investorId; }
    public String getAssetClass() { return assetClass; }
    public Double getMinPercent() { return minPercent; }
    public Double getMaxPercent() { return maxPercent; }

    public void setId(Long id) { this.id = id; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }
    public void setAssetClass(String assetClass) { this.assetClass = assetClass; }
    public void setMinPercent(Double minPercent) { this.minPercent = minPercent; }
    public void setMaxPercent(Double maxPercent) { this.maxPercent = maxPercent; }
}
