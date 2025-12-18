package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "investor_profile")
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String investorId;

    private String fullName;

    @Column(unique = true)
    private String email;

    private boolean active = true;

    private LocalDateTime createdAt = LocalDateTime.now();
}
