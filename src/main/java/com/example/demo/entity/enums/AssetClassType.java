package com.example.demo.entity.enums;
import com.example.demo.entity.enums.AssetClassType;

@Enumerated(EnumType.STRING)
private AssetClassType assetClass;


public enum AssetClassType {
    EQUITY,
    DEBT,
    GOLD,
    REAL_ESTATE,
    CASH
}
