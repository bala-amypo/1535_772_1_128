package com.example.demo.controller;

import com.example.demo.entity.RebalancingAlertRecord;
import com.example.demo.service.RebalancingAlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rebalancing-alerts")
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
    public List<RebalancingAlertRecord> getByInvestorId(
            @PathVariable String investorId   // ✅ String, not Long
    ) {
        return service.getByInvestorId(investorId);
    }
}
