package com.example.demo.controller;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.repository.HoldingRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holdings")
public class HoldingRecordController {

    private final HoldingRecordRepository repository;

    public HoldingRecordController(HoldingRecordRepository repository) {
        this.repository = repository;
    }

    // CREATE holding
    @PostMapping
    public HoldingRecord add(@RequestBody HoldingRecord holding) {
        if (holding.getCurrentValue() == null || holding.getCurrentValue() <= 0) {
            throw new IllegalArgumentException("currentValue must be > 0");
        }
        return repository.save(holding);
    }

    // GET holdings by investor
    @GetMapping("/investor/{investorId}")
    public List<HoldingRecord> getByInvestor(@PathVariable Long investorId) {
        return repository.findByInvestorId(investorId);
    }

    // GET all holdings
    @GetMapping
    public List<HoldingRecord> getAll() {
        return repository.findAll();
    }
}
