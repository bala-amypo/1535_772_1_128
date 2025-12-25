package com.example.demo.controller;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.service.HoldingRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holdings")
public class HoldingRecordController {

    private final HoldingRecordService service;

    public HoldingRecordController(HoldingRecordService service) {
        this.service = service;
    }

    @PostMapping
    public HoldingRecord addHolding(@RequestBody HoldingRecord record) {
        return service.addHolding(record);
    }

    @GetMapping("/investor/{investorId}")
    public List<HoldingRecord> getHoldings(@PathVariable Long investorId) {
        return service.getHoldingsByInvestor(investorId);
    }
}
