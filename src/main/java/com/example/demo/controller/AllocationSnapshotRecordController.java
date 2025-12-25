package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AllocationSnapshot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalValue;

    @ManyToOne
    private InvestorProfile investor;

    // getters & setters
}
