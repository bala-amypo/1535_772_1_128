package com.example.demo.service;

import com.example.demo.entity.RebalancingAlertRecord;
import java.util.List;

public interface RebalancingAlertService {
    List<RebalancingAlertRecord> getAlerts(Long investorId);
    RebalancingAlertRecord resolveAlert(Long alertId);
}
