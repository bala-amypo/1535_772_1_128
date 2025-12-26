package com.example.demo.util;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllocationUtils {

    private AllocationUtils() {
        // utility class
    }

    public static Map<AssetClassType, Double> calculateAllocation(
            List<HoldingRecord> holdings,
            double totalValue
    ) {

        Map<AssetClassType, Double> allocation = new HashMap<>();

        for (HoldingRecord holding : holdings) {
            AssetClassType assetClass = holding.getAssetClass();
            double value = holding.getCurrentValue();

            allocation.put(
                    assetClass,
                    allocation.getOrDefault(assetClass, 0.0) + value
            );
        }

        // convert values → percentages
        allocation.replaceAll(
                (k, v) -> (v / totalValue) * 100
        );

        return allocation;
    }
}
