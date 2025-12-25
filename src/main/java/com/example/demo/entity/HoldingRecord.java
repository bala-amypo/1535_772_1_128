package com.example.demo.entity;


import com.example.demo.entity.enums.AssetClassType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;



@Entity
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private InvestorProfile investor;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    @Positive
    private double currentValue;

    // getters & setters
}
