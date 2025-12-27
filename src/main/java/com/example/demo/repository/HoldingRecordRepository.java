package com.example.demo.repository;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HoldingRecordRepository
        extends JpaRepository<HoldingRecord, Long> {

    // ===============================
    // ✅ METHODS USED BY SERVICES
    // ===============================

    List<HoldingRecord> findByInvestorId(Long investorId);

    List<HoldingRecord> findByCurrentValueGreaterThan(Double value);

    List<HoldingRecord> findByInvestorIdAndAssetClass(
            Long investorId,
            AssetClassType assetClass
    );

    // ===============================
    // 🧪 METHODS REQUIRED BY TESTCASE
    // (EXACT NAMES — DO NOT CHANGE)
    // ===============================

    @Query("SELECT h FROM HoldingRecord h WHERE h.currentValue > :value")
    List<HoldingRecord> findByValueGreaterThan(@Param("value") double value);

    @Query("""
        SELECT h FROM HoldingRecord h
        WHERE h.investorId = :investorId
        AND h.assetClass = :assetClass
    """)
    List<HoldingRecord> findByInvestorAndAssetClass(
            @Param("investorId") long investorId,
            @Param("assetClass") AssetClassType assetClass
    );
}
