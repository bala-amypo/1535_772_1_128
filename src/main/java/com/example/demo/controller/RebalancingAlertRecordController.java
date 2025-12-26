package com.example.demo.controller;

import com.example.demo.entity.RebalancingAlert;
import com.example.demo.service.RebalancingAlertService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rebalancing")
public class RebalancingAlertController {

    private final RebalancingAlertService service;

    public RebalancingAlertController(RebalancingAlertService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RebalancingAlert> create(
            @Valid @RequestBody RebalancingAlert alert) {
        return ResponseEntity.ok(service.create(alert));
    }

    @GetMapping
    public ResponseEntity<List<RebalancingAlert>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RebalancingAlert> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RebalancingAlert> update(
            @PathVariable Long id,
            @Valid @RequestBody RebalancingAlert alert) {
        return ResponseEntity.ok(service.update(id, alert));
    }

    @PostMapping("/{id}/evaluate")
    public ResponseEntity<Void> evaluate(@PathVariable Long id) {
        service.evaluate(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
