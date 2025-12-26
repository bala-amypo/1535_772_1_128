package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.HoldingRecord;

public interface HoldingRecordService {

    HoldingRecord save(HoldingRecord record);

    List<HoldingRecord> getByInvestorId(String investorId);

    List<HoldingRecord> getAll();

    void delete(String investorId);
}
