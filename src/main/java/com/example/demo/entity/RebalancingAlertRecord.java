package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rebalancing_alert_record")
public class RebalancingAlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "investor_id", nullable = false)
    private String investorId;

    private String message;
    private String severity;

    public RebalancingAlertRecord() {}

    public RebalancingAlertRecord(String investorId, String message, String severity) {
        this.investorId = investorId;
        this.message = message;
        this.severity = severity;
    }

    public Long getId() { return id; }
    public String getInvestorId() { return investorId; }
    public String getMessage() { return message; }
    public String getSeverity() { return severity; }

    public void setId(Long id) { this.id = id; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }
    public void setMessage(String message) { this.message = message; }
    public void setSeverity(String severity) { this.severity = severity; }
}
