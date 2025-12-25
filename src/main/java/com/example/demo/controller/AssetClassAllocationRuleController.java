package com.example.demo.entity;

import com.example.demo.entity.enums.AssetClassType;

import com.example.demo.entity.enums.AssetClassType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

@Entity
public class AssetClassAllocationRuleController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AssetClassType assetClass;

    @Min(0)
    @Max(100)
    private int targetPercentage;

    @ManyToOne
    private InvestorProfile investor;

    // getters & setters
}
