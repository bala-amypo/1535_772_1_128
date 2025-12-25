package com.example.demo.controller;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.service.RebalancingAlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rebalancing-alerts")
public class RebalancingAlertRecordController {

    private final RebalancingAlertService service;

    public RebalancingAlertRecordController(
            RebalancingAlertService service) {
        this.service = service;
    }

    @PostMapping
    public RebalancingAlertRecord create(
            @RequestBody RebalancingAlertRecord record) {
        return service.save(record);
    }

    @GetMapping("/{investorId}")
    public List<RebalancingAlertRecord> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestorId(investorId);
    }
}
