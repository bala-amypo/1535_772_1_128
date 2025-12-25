package com.example.demo.service;

import com.example.demo.entity.HoldingRecord;
import java.util.List;

public interface HoldingRecordService {
    HoldingRecord addHolding(HoldingRecord record);
    List<HoldingRecord> getHoldingsByInvestor(Long investorId);
}
