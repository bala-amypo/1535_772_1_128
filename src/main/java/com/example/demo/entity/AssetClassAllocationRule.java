package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_class_allocation_rule")
public class AssetClassAllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private double targetPercentage;

    private boolean active = true;
}
