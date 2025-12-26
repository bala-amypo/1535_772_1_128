package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.service.InvestorProfileService;

@RestController
@RequestMapping("/api/investors")
public class InvestorProfileController {

    private final InvestorProfileService service;

    public InvestorProfileController(InvestorProfileService service) {
        this.service = service;
    }

    @PostMapping
    public InvestorProfile create(@RequestBody InvestorProfile investor) {
        return service.save(investor);
    }

    @GetMapping("/{investorId}")
    public InvestorProfile getByInvestorId(@PathVariable String investorId) {
        return service.getByInvestorId(investorId);
    }

    @GetMapping
    public List<InvestorProfile> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public InvestorProfile update(@PathVariable Long id,
                                  @RequestBody InvestorProfile investor) {
        return service.update(id, investor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
