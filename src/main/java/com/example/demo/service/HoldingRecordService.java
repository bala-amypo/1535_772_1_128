package com.example.demo.service;

import com.example.demo.entity.HoldingRecord;
import java.util.*;

public interface HoldingRecordService {

    HoldingRecord save(HoldingRecord record);

    List<HoldingRecord> getByInvestorId(String investorId);

    Optional<HoldingRecord> getById(String id);
}
