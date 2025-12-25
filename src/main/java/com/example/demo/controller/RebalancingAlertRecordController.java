package com.example.demo.controller;

import com.example.demo.entity.RebalancingAlert;
import com.example.demo.service.RebalancingAlertService;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/alerts")
public class RebalancingAlertRecordController {

    private final RebalancingAlertService service;

    public RebalancingAlertRecordController(RebalancingAlertService service) {
        this.service = service;
    }

    @GetMapping("/investor/{investorId}")
    public List<RebalancingAlertRecord> getAlerts(@PathVariable Long investorId) {
        return service.getAlerts(investorId);
    }

    @PutMapping("/resolve/{alertId}")
    public RebalancingAlertRecord resolve(@PathVariable Long alertId) {
        return service.resolveAlert(alertId);
    }
}
