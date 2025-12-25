package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshot;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/snapshots")
public class AllocationSnapshotController {

    private final AllocationSnapshotService service;

    public AllocationSnapshotController(AllocationSnapshotService service) {
        this.service = service;
    }

    @PostMapping
    public AllocationSnapshot create(@RequestBody AllocationSnapshot snapshot) {
        return service.save(snapshot);
    }
}
