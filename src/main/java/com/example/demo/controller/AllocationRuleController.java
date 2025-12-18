package com.example.demo.controller;

import com.example.demo.model.AssetClassAllocationRuleModel;
import com.example.demo.service.AssetClassAllocationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-rules")
public class AllocationRuleController {

    private final AssetClassAllocationRuleService service;

    public AllocationRuleController(AssetClassAllocationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public AssetClassAllocationRuleModel create(
            @RequestBody AssetClassAllocationRuleModel model) {
        return service.create(model);
    }

    @GetMapping("/investor/{investorId}")
    public List<AssetClassAllocationRuleModel> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestor(investorId);
    }
}
