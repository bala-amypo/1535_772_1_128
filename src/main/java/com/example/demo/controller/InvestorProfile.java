package com.example.demo.controller;

import com.example.demo.model.InvestorProfile;
import com.example.demo.repository.InvestorProfileRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investors")
public class InvestorProfileController {

    private final InvestorProfileRepository repo;

    public InvestorProfileController(InvestorProfileRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public InvestorProfile create(@RequestBody InvestorProfile investor) {
        investor.setActive(true); // IMPORTANT
        return repo.save(investor);
    }

    @GetMapping("/{id}")
    public InvestorProfile getById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
}
