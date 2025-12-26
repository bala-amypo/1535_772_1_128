package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "investor_profile",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "investor_id"),
        @UniqueConstraint(columnNames = "email")
    }
)
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // DB PK (keep Long)

    @Column(name = "investor_id", nullable = false, unique = true)
    private String investorId; // BUSINESS ID (String)

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Boolean active;

    // ---------- constructors ----------
    public InvestorProfile() {}

    public InvestorProfile(String investorId, String fullName, String email, Boolean active) {
        this.investorId = investorId;
        this.fullName = fullName;
        this.email = email;
        this.active = active;
    }

    // ---------- getters & setters ----------
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
