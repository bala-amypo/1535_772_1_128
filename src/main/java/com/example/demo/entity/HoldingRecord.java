package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "holding_records")
public class HoldingRecord {
    
    @Column(name = "investor_id")
    private String investorId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String investorId;

    @NotNull
    private String assetName;

    @Min(0)
    private Double quantity;

    @Min(0)
    private Double value;

    public HoldingRecord() {}

    public HoldingRecord(Long id, String investorId, String assetName, Double quantity, Double value) {
        this.id = id;
        this.investorId = investorId;
        this.assetName = assetName;
        this.quantity = quantity;
        this.value = value;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getInvestorId() { return investorId; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }

    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }

    public Double getQuantity() { return quantity; }
    public void setQuantity(Double quantity) { this.quantity = quantity; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }
}
