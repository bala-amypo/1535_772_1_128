package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.service.AllocationSnapshotRecordService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-snapshots")
public class AllocationSnapshotRecordController {

    private final AllocationSnapshotRecordService service;

    public AllocationSnapshotRecordController(AllocationSnapshotRecordService service) {
        this.service = service;
    }

    // CREATE snapshot
    @PostMapping
    public AllocationSnapshotRecord create(
            @Valid @RequestBody AllocationSnapshotRecord snapshot) {
        return service.save(snapshot);
    }

    // GET snapshots by investor
    @GetMapping("/investor/{investorId}")
    public List<AllocationSnapshotRecord> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestorId(investorId);
    }
}
