package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "allocation_snapshot_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AllocationSnapshotRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long investorId;

    @Column(nullable = false)
    private LocalDateTime snapshotDate = LocalDateTime.now();

    @Column(nullable = false)
    private Double totalPortfolioValue;

    @Lob
    @Column(nullable = false)
    private String allocationJson;
}
