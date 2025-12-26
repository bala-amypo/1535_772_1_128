package com.example.demo.entity;

import com.example.demo.entity.enums.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RebalancingAlertRecord {

    @Id
    private String id;

    private String investorId;

    @Enumerated(EnumType.STRING)
    private AssetClassType assetClass;

    private Double currentPercentage;
    private Double targetPercentage;

    @Enumerated(EnumType.STRING)
    private AlertSeverity severity;

    private String message;
    private LocalDateTime createdAt;
    private Boolean resolved;

    public RebalancingAlertRecord() {}

    public RebalancingAlertRecord(String investorId, AssetClassType assetClass,
                                  Double current, Double target,
                                  AlertSeverity severity,
                                  String message, LocalDateTime time,
                                  Boolean resolved) {
        this.id = investorId + "-" + assetClass + "-" + time;
        this.investorId = investorId;
        this.assetClass = assetClass;
        this.currentPercentage = current;
        this.targetPercentage = target;
        this.severity = severity;
        this.message = message;
        this.createdAt = time;
        this.resolved = resolved;
    }

    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean r) { this.resolved = r; }
    public Double getCurrentPercentage() { return currentPercentage; }
    public AlertSeverity getSeverity() { return severity; }
}
