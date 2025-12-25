package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String fullName;

    @NotBlank
    private String email;

    private boolean active = true;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<HoldingRecord> holdings;

    // getters & setters
}
