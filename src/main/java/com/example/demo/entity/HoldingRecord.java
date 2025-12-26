package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "holding_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Asset name is required")
    private String assetName;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be > 0")
    private Integer quantity;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.0", inclusive = false)
    private Double price;

    @NotNull
    private Boolean active = true;
}
