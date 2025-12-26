package com.example.demo.controller;

import com.example.demo.entity.AllocationSnapshot;
import com.example.demo.service.AllocationSnapshotService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
public class AllocationSnapshotController {

    private final AllocationSnapshotService service;

    public AllocationSnapshotController(
            AllocationSnapshotService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AllocationSnapshot> create(
            @Valid @RequestBody AllocationSnapshot snapshot) {
        return ResponseEntity.ok(service.create(snapshot));
    }

    @GetMapping
    public ResponseEntity<List<AllocationSnapshot>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AllocationSnapshot> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
