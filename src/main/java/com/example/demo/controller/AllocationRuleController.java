package com.example.demo.controller;

import com.example.demo.model.AssetClassAllocationRuleModel;
import com.example.demo.service.AssetClassAllocationRuleService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-rules")
public class AllocationRuleController {

    private final AssetClassAllocationRuleService ruleService;

    public AllocationRuleController(AssetClassAllocationRuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<AssetClassAllocationRuleModel> create(
            @RequestBody AssetClassAllocationRuleModel model) {
        return ResponseEntity.ok(ruleService.create(model));
    }

    @GetMapping(
        value = "/investor/{investorId}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<AssetClassAllocationRuleModel>> getByInvestor(
            @PathVariable Long investorId) {
        return ResponseEntity.ok(ruleService.getByInvestor(investorId));
    }
}
