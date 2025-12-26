package com.example.demo.controller;

import com.example.demo.entity.AssetAllocationRule;
import com.example.demo.service.AssetAllocationRuleService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-rules")
public class AssetAllocationRuleController {

    private final AllocationRuleService service;

    public AllocationRuleController(
            AllocationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AssetAllocationRule> create(
            @Valid @RequestBody AssetAllocationRule rule) {
        return ResponseEntity.ok(service.create(rule));
    }

    @GetMapping
    public ResponseEntity<List<AllocationRule>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AllocationRule> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AssetAllocationRule> update(
            @PathVariable Long id,
            @Valid @RequestBody AssetAllocationRule rule) {
        return ResponseEntity.ok(service.update(id, rule));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
