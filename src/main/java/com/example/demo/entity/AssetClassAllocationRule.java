package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import com.example.demo.entity.enums.AssetClassType;

private AssetClassType assetClass;


@Entity
public class AssetClassAllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private InvestorProfile investor;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    @Min(0)
    @Max(100)
    private double targetPercentage;

    // getters & setters
}
