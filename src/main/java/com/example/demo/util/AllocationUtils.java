package com.example.demo.util;

import java.util.Map;

public class AllocationUtils {

    private AllocationUtils() {
        // util class
    }

    // 🔹 used in testcase to validate allocation %
    public static boolean isValidAllocation(Map<String, Double> allocationMap) {
        if (allocationMap == null || allocationMap.isEmpty()) {
            return false;
        }

        double total = allocationMap.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        // allow small floating-point error
        return Math.abs(total - 100.0) < 0.0001;
    }

    // 🔹 used in testcase to normalize allocation %
    public static Map<String, Double> normalizeAllocation(Map<String, Double> allocationMap) {
        double total = allocationMap.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        if (total == 0) {
            return allocationMap;
        }

        allocationMap.replaceAll(
                (k, v) -> (v / total) * 100
        );

        return allocationMap;
    }
}
