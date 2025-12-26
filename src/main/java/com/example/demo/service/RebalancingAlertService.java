package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.RebalancingAlertRecord;

public interface RebalancingAlertService {

    List<RebalancingAlertRecord> getAlerts(Long investorId);
}
