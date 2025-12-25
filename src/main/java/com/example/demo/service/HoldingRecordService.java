package com.example.demo.service;

import com.example.demo.entity.HoldingRecord;
import java.util.List;

public interface HoldingRecordService {
    HoldingRecord save(HoldingRecord record);
    List<HoldingRecord> getByInvestorId(String investorId);
}
