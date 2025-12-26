package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "rebalancing_alerts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RebalancingAlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Asset name is required")
    private String assetName;

    @NotNull(message = "Target allocation is required")
    @DecimalMin(value = "0.0", inclusive = false)
    @DecimalMax(value = "100.0")
    private Double targetAllocation; // %

    @NotNull(message = "Current allocation is required")
    @DecimalMin(value = "0.0", inclusive = false)
    @DecimalMax(value = "100.0")
    private Double currentAllocation; // %

    @NotNull
    private Boolean triggered = false;
}
