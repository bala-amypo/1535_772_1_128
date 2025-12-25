package com.example.demo.controller;

import com.example.demo.entity.RebalancingAlert;
import com.example.demo.service.RebalancingAlertService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alerts")
public class RebalancingAlertController {

    private final RebalancingAlertService service;

    public RebalancingAlertController(RebalancingAlertService service) {
        this.service = service;
    }

    @PostMapping
    public RebalancingAlert create(@RequestBody RebalancingAlert alert) {
        return service.save(alert);
    }
}
