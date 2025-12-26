package com.example.demo.controller;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.service.AllocationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-rules")
public class AssetClassAllocationRuleController {

    private final AllocationRuleService allocationRuleService;

    public AssetClassAllocationRuleController(AllocationRuleService allocationRuleService) {
        this.allocationRuleService = allocationRuleService;
    }

    // ✅ POST /api/allocation-rules
    @PostMapping
    public AssetClassAllocationRule createRule(
            @RequestBody AssetClassAllocationRule rule
    ) {
        return allocationRuleService.createRule(rule);
    }

    // ✅ PUT /api/allocation-rules/{id}
    @PutMapping("/{id}")
    public AssetClassAllocationRule updateRule(
            @PathVariable Long id,
            @RequestBody AssetClassAllocationRule updatedRule
    ) {
        return allocationRuleService.updateRule(id, updatedRule);
    }

    // ✅ GET /api/allocation-rules/investor/{investorId}
    @GetMapping("/investor/{investorId}")
    public List<AssetClassAllocationRule> getRulesByInvestor(
            @PathVariable Long investorId
    ) {
        return allocationRuleService.getRulesByInvestor(investorId);
    }

    // ✅ GET /api/allocation-rules/{id}
    @GetMapping("/{id}")
    public AssetClassAllocationRule getRuleById(
            @PathVariable Long id
    ) {
        return allocationRuleService.getRuleById(id);
    }

    // ✅ GET /api/allocation-rules
    @GetMapping
    public List<AssetClassAllocationRule> getAllRules() {
        return allocationRuleService.getAllRules();
    }
}
