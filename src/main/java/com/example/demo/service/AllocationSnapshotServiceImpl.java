package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
public class AllocationSnapshotController {

    private final AllocationSnapshotService allocationSnapshotService;

    // ✅ Constructor injection (required)
    public AllocationSnapshotController(AllocationSnapshotService allocationSnapshotService) {
        this.allocationSnapshotService = allocationSnapshotService;
    }

    // POST /api/snapshots/compute/{investorId}
    @PostMapping("/compute/{investorId}")
    public AllocationSnapshotRecord computeSnapshot(@PathVariable Long investorId) {
        return allocationSnapshotService.computeSnapshot(investorId);
    }

    // GET /api/snapshots/investor/{investorId}
    @GetMapping("/investor/{investorId}")
    public List<AllocationSnapshotRecord> getSnapshotsByInvestor(
            @PathVariable Long investorId) {
        return allocationSnapshotService.getSnapshotsByInvestor(investorId);
    }

    // GET /api/snapshots/{id}
    @GetMapping("/{id}")
    public AllocationSnapshotRecord getSnapshotById(@PathVariable Long id) {
        return allocationSnapshotService.getSnapshotById(id);
    }

    // GET /api/snapshots
    @GetMapping
    public List<AllocationSnapshotRecord> getAllSnapshots() {
        return allocationSnapshotService.getAllSnapshots();
    }
}
