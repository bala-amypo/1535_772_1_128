package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private boolean active = true;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<HoldingRecord> holdings;

    // getters & setters
}
