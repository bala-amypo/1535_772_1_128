package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "investor_profile")
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Full name is required")
    private String fullName;

    @Email(message = "Invalid email")
    @Column(unique = true)
    private String email;

    // 🔗 Relationships
    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HoldingRecord> holdings;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AssetClassAllocationRule> allocationRules;

    // ✅ getters & setters
    public Long getId() {
        return id;
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

    public List<HoldingRecord> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<HoldingRecord> holdings) {
        this.holdings = holdings;
    }

    public List<AssetClassAllocationRule> getAllocationRules() {
        return allocationRules;
    }

    public void setAllocationRules(List<AssetClassAllocationRule> allocationRules) {
        this.allocationRules = allocationRules;
    }
}
