package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RebalancingAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetClass;
    private String message;
    private boolean resolved;

    @ManyToOne
    private InvestorProfile investor;
}
