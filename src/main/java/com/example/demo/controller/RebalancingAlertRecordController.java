package com.example.demo.controller;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.service.RebalancingAlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class RebalancingAlertRecordController {

    private final RebalancingAlertService service;

    public RebalancingAlertRecordController(
            RebalancingAlertService service) {
        this.service = service;
    }

    @PostMapping
    public RebalancingAlertRecord create(
            @RequestBody RebalancingAlertRecord alert) {
        return service.save(alert);
    }

    @GetMapping("/investor/{investorId}")
    public List<RebalancingAlertRecord> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestorId(investorId);
    }
}
