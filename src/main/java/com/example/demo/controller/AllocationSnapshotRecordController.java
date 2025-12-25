package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
public class AllocationSnapshotRecordController {

    private final AllocationSnapshotService service;

    public AllocationSnapshotRecordController(AllocationSnapshotService service) {
        this.service = service;
    }

    @GetMapping("/investor/{investorId}")
    public List<AllocationSnapshotRecord> getSnapshots(@PathVariable Long investorId) {
        return service.getSnapshotsByInvestor(investorId);
    }
}
