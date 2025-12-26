package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.service.RebalancingAlertService;

@RestController
@RequestMapping("/alerts")
public class RebalancingAlertRecordController {

    private final RebalancingAlertService service;

    public RebalancingAlertRecordController(RebalancingAlertService service) {
        this.service = service;
    }

    @PostMapping
    public RebalancingAlertRecord save(@RequestBody RebalancingAlertRecord record) {
        return service.save(record);
    }

    @GetMapping("/{investorId}")
    public List<RebalancingAlertRecord> getByInvestorId(@PathVariable Long investorId) {
        return service.getByInvestorId(investorId);
    }
}
