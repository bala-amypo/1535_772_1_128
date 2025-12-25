package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AllocationSnapshot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetClass;
    private Double percentage;

    @ManyToOne
    private InvestorProfile investor;
}
