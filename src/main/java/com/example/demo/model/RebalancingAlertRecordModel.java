package com.example.demo.model;

public class RebalancingAlertRecordModel {

    private String investorId;
    private String message;
    private String severity;

    public RebalancingAlertRecordModel() {}

    public String getInvestorId() { return investorId; }
    public String getMessage() { return message; }
    public String getSeverity() { return severity; }

    public void setInvestorId(String investorId) { this.investorId = investorId; }
    public void setMessage(String message) { this.message = message; }
    public void setSeverity(String severity) { this.severity = severity; }
}
