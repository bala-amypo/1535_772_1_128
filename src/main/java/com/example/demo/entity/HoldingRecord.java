package com.example.demo.entity;

import com.example.demo.entity.enums.AssetClassType;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class HoldingRecord {

    @Id
    private String id;

    private String investorId;

    @Enumerated(EnumType.STRING)
    private AssetClassType assetClass;

    private Double currentValue;
    private LocalDateTime recordedAt;

    public HoldingRecord() {}

    public HoldingRecord(String investorId, AssetClassType assetClass,
                         Double currentValue, LocalDateTime recordedAt) {
        this.id = investorId + "-" + assetClass + "-" + recordedAt;
        this.investorId = investorId;
        this.assetClass = assetClass;
        this.currentValue = currentValue;
        this.recordedAt = recordedAt;
    }

    public String getId() { return id; }
    public String getInvestorId() { return investorId; }
    public Double getCurrentValue() { return currentValue; }
}
