package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "holding_record")
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "investor_id", nullable = false)
    private String investorId;

    private String assetName;
    private Double quantity;
    private Double value;

    public HoldingRecord() {}

    public HoldingRecord(String investorId, String assetName, Double quantity, Double value) {
        this.investorId = investorId;
        this.assetName = assetName;
        this.quantity = quantity;
        this.value = value;
    }

    public Long getId() { return id; }
    public String getInvestorId() { return investorId; }
    public String getAssetName() { return assetName; }
    public Double getQuantity() { return quantity; }
    public Double getValue() { return value; }

    public void setId(Long id) { this.id = id; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }
    public void setAssetName(String assetName) { this.assetName = assetName; }
    public void setQuantity(Double quantity) { this.quantity = quantity; }
    public void setValue(Double value) { this.value = value; }
}
