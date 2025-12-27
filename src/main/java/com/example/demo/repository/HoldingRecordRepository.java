package com.example.demo.repository;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoldingRecordRepository
        extends JpaRepository<HoldingRecord, Long> {

    // REQUIRED by tests
    List<HoldingRecord> findByValueGreaterThan(double value);

    // REQUIRED by tests
    List<HoldingRecord> findByInvestorAndAssetClass(
            long investorId,
            AssetClassType assetClass
    );

    // used by services
    List<HoldingRecord> findByInvestorId(Long investorId);
}
