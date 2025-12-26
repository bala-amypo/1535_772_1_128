package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class InvestorProfile {

    @Id
    private String id;   // STRING ID

    @Column(unique = true, nullable = false)
    private String investorId;

    private String fullName;
    private String email;
    private Boolean active;

    public InvestorProfile() {}

    public InvestorProfile(String investorId, String fullName, String email, Boolean active) {
        this.id = investorId;
        this.investorId = investorId;
        this.fullName = fullName;
        this.email = email;
        this.active = active;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getInvestorId() { return investorId; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
