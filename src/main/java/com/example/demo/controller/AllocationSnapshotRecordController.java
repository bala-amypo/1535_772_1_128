package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-snapshots")
public class AllocationSnapshotRecordController {

    private final AllocationSnapshotService service;

    public AllocationSnapshotRecordController(
            AllocationSnapshotService service) {
        this.service = service;
    }

    @PostMapping
    public AllocationSnapshotRecord create(
            @RequestBody AllocationSnapshotRecord record) {
        return service.save(record);
    }

    @GetMapping("/investor/{investorId}")
    public List<AllocationSnapshotRecord> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestorId(investorId);
    }
}
