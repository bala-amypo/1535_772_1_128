package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RebalancingAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @ManyToOne
    private InvestorProfile investor;

    // getters & setters
}
