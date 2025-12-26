package com.example.demo.util;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllocationUtils {

    /**
     * Calculates allocation percentage per AssetClassType
     */
    public static Map<AssetClassType, Double> calculateAllocationPercentages(
            List<HoldingRecord> holdings,
            double totalPortfolioValue
    ) {

        Map<AssetClassType, Double> allocationMap = new HashMap<>();

        for (HoldingRecord holding : holdings) {
            AssetClassType assetClass = holding.getAssetClass();
            double value = holding.getCurrentValue();

            allocationMap.put(
                    assetClass,
                    allocationMap.getOrDefault(assetClass, 0.0) + value
            );
        }

        // convert values to percentages
        for (Map.Entry<AssetClassType, Double> entry : allocationMap.entrySet()) {
            double percentage = (entry.getValue() / totalPortfolioValue) * 100;
            allocationMap.put(entry.getKey(), percentage);
        }

        return allocationMap;
    }
}
