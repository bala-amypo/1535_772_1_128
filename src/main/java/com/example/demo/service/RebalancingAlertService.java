package com.example.demo.service;

import com.example.demo.entity.RebalancingAlertRecord;
import java.util.List;

public interface RebalancingAlertService {

    RebalancingAlertRecord save(RebalancingAlertRecord record);

    List<RebalancingAlertRecord> getByInvestorId(Long investorId);
}
