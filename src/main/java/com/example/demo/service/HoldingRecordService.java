package com.example.demo.service;

import com.example.demo.entity.HoldingRecord;

import java.util.List;

public interface HoldingRecordService {

    HoldingRecord save(HoldingRecord holdingRecord);

    List<HoldingRecord> getByInvestorId(Long investorId);
}
