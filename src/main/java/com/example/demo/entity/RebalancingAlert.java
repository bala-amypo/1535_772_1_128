package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RebalancingAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private InvestorProfile investor;

    @Enumerated(EnumType.STRING)
    private AlertSeverity severity;

    private String message;
    private boolean resolved;
}
