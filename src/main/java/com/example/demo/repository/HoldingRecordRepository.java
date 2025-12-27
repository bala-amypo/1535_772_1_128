package com.example.demo.repository;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HoldingRecordRepository
        extends JpaRepository<HoldingRecord, Long> {

    List<HoldingRecord> findByInvestorId(Long investorId);

    // ✅ matches field: currentValue
    List<HoldingRecord> findByCurrentValueGreaterThan(Double value);

    // ✅ matches field: investorId (NOT investor)
    List<HoldingRecord> findByInvestorIdAndAssetClass(
            Long investorId,
            AssetClassType assetClass
    );
}
