package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.RebalancingAlertRecord;

public interface RebalancingAlertService {

    RebalancingAlertRecord save(RebalancingAlertRecord record);

    List<RebalancingAlertRecord> getByInvestorId(Long investorId);
}
