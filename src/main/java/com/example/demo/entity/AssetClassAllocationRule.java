package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "asset_allocation_rules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AssetAllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Asset class is required")
    private String assetClass; // EQUITY, DEBT, GOLD

    @NotNull(message = "Min allocation required")
    @DecimalMin(value = "0.0")
    @DecimalMax(value = "100.0")
    private Double minAllocation;

    @NotNull(message = "Max allocation required")
    @DecimalMin(value = "0.0")
    @DecimalMax(value = "100.0")
    private Double maxAllocation;

    @NotNull
    private Boolean active = true;
}
