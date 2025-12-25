package com.example.demo.controller;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.service.AllocationRuleService;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/allocation-rules")
public class AllocationRuleController {

    private final AllocationRuleService service;

    public AllocationRuleController(AllocationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public AssetClassAllocationRule createRule(@RequestBody AssetClassAllocationRule rule) {
        return service.createRule(rule);
    }

    @GetMapping("/investor/{investorId}")
    public List<AssetClassAllocationRule> getRules(@PathVariable Long investorId) {
        return service.getRulesByInvestor(investorId);
    }
}
