package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "allocation_snapshots")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AllocationSnapshotRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Asset class required")
    private String assetClass; // EQUITY, DEBT, GOLD

    @NotNull
    @DecimalMin(value = "0.0")
    @DecimalMax(value = "100.0")
    private Double allocationPercentage;

    @NotNull
    private LocalDateTime snapshotTime;
}
