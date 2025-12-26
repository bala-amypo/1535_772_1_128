package com.example.demo.util;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class AllocationUtils {

    private AllocationUtils() {
        // utility class
    }

    /**
     * Calculates allocation percentage per asset class.
     */
    public static Map<AssetClassType, Double> calculateAllocationPercentage(
            List<HoldingRecord> holdings,
            double totalValue) {

        Map<AssetClassType, Double> allocation = new EnumMap<>(AssetClassType.class);

        for (HoldingRecord holding : holdings) {
            allocation.putIfAbsent(holding.getAssetClass(), 0.0);
            allocation.put(
                    holding.getAssetClass(),
                    allocation.get(holding.getAssetClass()) + holding.getCurrentValue()
            );
        }

        // convert value → percentage
        for (AssetClassType type : allocation.keySet()) {
            double percent = (allocation.get(type) / totalValue) * 100;
            allocation.put(type, percent);
        }

        return allocation;
    }
}
