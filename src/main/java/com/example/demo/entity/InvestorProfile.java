package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "investor_profiles")
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String investorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Boolean active;

    // 🔹 No-args constructor (MANDATORY for JPA & tests)
    public InvestorProfile() {
    }

    // 🔹 All-args constructor (TEST CASES EXPECT THIS)
    public InvestorProfile(String investorId, String name, String email, Boolean active) {
        this.investorId = investorId;
        this.name = name;
        this.email = email;
        this.active = active;
    }

    // 🔹 Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
