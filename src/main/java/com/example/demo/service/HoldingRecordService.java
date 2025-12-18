package com.example.demo.service;

import com.example.demo.model.HoldingRecordModel;
import java.util.List;

public interface HoldingRecordService {
    HoldingRecordModel add(HoldingRecordModel model);
    List<HoldingRecordModel> getByInvestor(Long investorId);
}
