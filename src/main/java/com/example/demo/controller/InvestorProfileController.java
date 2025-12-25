package com.example.demo.controller;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.service.InvestorProfileService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investors")
public class InvestorProfileController {

    private final InvestorProfileService service;

    public InvestorProfileController(InvestorProfileService service) {
        this.service = service;
    }

    @PostMapping
    public InvestorProfile create(@Valid @RequestBody InvestorProfile investor) {
        return service.create(investor);
    }

    @GetMapping("/{id}")
    public InvestorProfile get(@PathVariable Long id) {
        return service.get(id);
    }
}
