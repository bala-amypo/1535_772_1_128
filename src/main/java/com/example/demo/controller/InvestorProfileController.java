package com.example.demo.controller;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.service.InvestorProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.enums.AssetClassType;

import java.util.List;

@RestController
@RequestMapping("/api/investors")
public class InvestorProfileController {

    private final InvestorProfileService service;

    public InvestorProfileController(InvestorProfileService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<InvestorProfile> create(@RequestBody InvestorProfile investor) {
        return ResponseEntity.ok(service.save(investor));
    }

    // GET BY INVESTOR ID
    @GetMapping("/{investorId}")
    public ResponseEntity<InvestorProfile> getByInvestorId(@PathVariable String investorId) {
        return ResponseEntity.ok(service.getByInvestorId(investorId));
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<InvestorProfile>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<InvestorProfile> update(
            @PathVariable Long id,
            @RequestBody InvestorProfile investor) {
        return ResponseEntity.ok(service.update(id, investor));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
