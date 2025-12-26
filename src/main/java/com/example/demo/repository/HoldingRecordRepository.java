
package com.example.demo.repository;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.entity.enums.AssetClassType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HoldingRecordRepository
        extends JpaRepository<HoldingRecord, String> {

    List<HoldingRecord> findByInvestorId(String investorId);

    // HQL test methods
    List<HoldingRecord> findByValueGreaterThan(Double value);

    List<HoldingRecord> findByInvestorAndAssetClass(
            String investorId, AssetClassType assetClass
    );
}
