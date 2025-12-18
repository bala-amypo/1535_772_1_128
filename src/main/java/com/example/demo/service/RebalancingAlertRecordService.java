package com.example.demo.service;

import com.example.demo.model.RebalancingAlertRecordModel;
import java.util.List;

public interface RebalancingAlertRecordService {
    List<RebalancingAlertRecordModel> getByInvestor(Long investorId);
    void resolve(Long alertId);
}
