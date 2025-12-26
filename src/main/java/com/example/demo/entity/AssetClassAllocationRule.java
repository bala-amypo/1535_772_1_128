package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_class_allocation_rule")
public class AssetClassAllocationRule {
    @Column(name = "investor_id")
    private String investorId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ✅ ONLY ONCE, ONLY Long
    @Column(name = "investor_id", nullable = false)
    private Long investorId;

    @Column(nullable = false)
    private String assetClass;

    @Column(nullable = false)
    private Double minPercentage;

    @Column(nullable = false)
    private Double maxPercentage;

    /* ===== getters & setters ===== */

    public Long getId() {
        return id;
    }

    public Long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Long investorId) {
        this.investorId = investorId;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public Double getMinPercentage() {
        return minPercentage;
    }

    public void setMinPercentage(Double minPercentage) {
        this.minPercentage = minPercentage;
    }

    public Double getMaxPercentage() {
        return maxPercentage;
    }

    public void setMaxPercentage(Double maxPercentage) {
        this.maxPercentage = maxPercentage;
    }
}
