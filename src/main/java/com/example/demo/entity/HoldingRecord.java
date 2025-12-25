package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String assetClass;

    @Positive
    private Double value;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private InvestorProfile investor;

    // getters & setters
}
