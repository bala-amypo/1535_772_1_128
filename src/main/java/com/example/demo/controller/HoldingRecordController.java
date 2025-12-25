package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String assetName;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    @Positive
    private double currentValue;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private InvestorProfile investor;

    // getters & setters
}
