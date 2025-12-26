package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String investorId;

    private String name;

    private Boolean active;

    public InvestorProfile() {}

    public InvestorProfile(String investorId, String name, Boolean active) {
        this.investorId = investorId;
        this.name = name;
        this.active = active;
    }

    public Long getId() { return id; }
    public String getInvestorId() { return investorId; }
    public String getName() { return name; }
    public Boolean getActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }
    public void setName(String name) { this.name = name; }
    public void setActive(Boolean active) { this.active = active; }
}
