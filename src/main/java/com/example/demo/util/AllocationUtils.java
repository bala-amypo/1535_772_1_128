package com.example.demo.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public final class AllocationUtils {

    private AllocationUtils() {
        // utility class
    }

    /** percentage = (part / total) * 100 */
    public static double calculatePercentage(double part, double total) {
        if (total == 0) return 0.0;
        return round((part / total) * 100);
    }

    /** total portfolio value from asset-value map */
    public static double totalValue(Map<String, Double> assetValues) {
        return assetValues.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    /** check deviation beyond threshold */
    public static boolean isDeviationExceeded(double current, double target, double threshold) {
        return Math.abs(current - target) > threshold;
    }

    /** round to 2 decimals */
    public static double round(double value) {
        return BigDecimal.valueOf(value)
                .setScale(2, RoundingMode.HALF_UP)
