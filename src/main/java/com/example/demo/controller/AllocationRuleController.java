package com.example.demo.controller;

import com.example.demo.entity.AssetClassAllocationRule;
import com.example.demo.repository.AssetClassAllocationRuleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocation-rules")
public class AllocationRuleController {

    private final AssetClassAllocationRuleRepository repository;

        public AllocationRuleController(AssetClassAllocationRuleRepository repository) {
                this.repository = repository;
                    }

                        // CREATE allocation rule
                            @PostMapping
                                public AssetClassAllocationRule create(@RequestBody AssetClassAllocationRule rule) {
                                        if (rule.getTargetPercentage() == null ||
                                                        rule.getTargetPercentage() < 0 ||
                                                                        rule.getTargetPercentage() > 100) {
                                                                                    throw new IllegalArgumentException("targetPercentage must be between 0 and 100");
                                                                                            }
                                                                                                    return repository.save(rule);
                                                                                                        }

                                                                                                            // GET rules by investor
                                                                                                                @GetMapping("/investor/{investorId}")
                                                                                                                    public List<AssetClassAllocationRule> getByInvestor(@PathVariable Long investorId) {
                                                                                                                            return repository.findByInvestorId(investorId);
                                                                                                                                }

                                                                                                                                    // GET all rules
                                                                                                                                        @GetMapping
                                                                                                                                            public List<AssetClassAllocationRule> getAll() {
                                                                                                                                                    return repository.findAll();
                                                                                                                                                        }
                                                                                                                                                        }
                                                                                                                                                        