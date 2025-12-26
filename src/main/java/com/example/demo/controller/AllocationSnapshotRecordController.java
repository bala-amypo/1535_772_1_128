package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.enums.AssetClassType;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-snapshots")
public class AllocationSnapshotRecordController {

    private final AllocationSnapshotService service;

    public AllocationSnapshotRecordController(
            AllocationSnapshotService service) {
        this.service = service;
    }

   @GetMapping("/investor/{investorId}")
public List<AllocationSnapshotRecord> getByInvestorId(
        @PathVariable String investorId) {
    return service.getByInvestorId(investorId);
}
