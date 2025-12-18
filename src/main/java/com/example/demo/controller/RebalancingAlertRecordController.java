package com.example.demo.controller;

import com.example.demo.model.RebalancingAlertRecordModel;
import com.example.demo.service.RebalancingAlertRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class RebalancingAlertRecordController {

    private final RebalancingAlertRecordService service;

    public RebalancingAlertRecordController(
            RebalancingAlertRecordService service) {
        this.service = service;
    }

    @GetMapping("/investor/{investorId}")
    public List<RebalancingAlertRecordModel> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestor(investorId);
    }

    @PutMapping("/resolve/{id}")
    public RebalancingAlertRecordModel resolve(
            @PathVariable Long id) {
        return service.resolve(id);
    }
}
