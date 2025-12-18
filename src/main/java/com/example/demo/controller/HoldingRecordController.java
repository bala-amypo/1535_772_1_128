package com.example.demo.controller;

import com.example.demo.model.HoldingRecordModel;
import com.example.demo.service.HoldingRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holdings")
public class HoldingRecordController {

    private final HoldingRecordService service;

    public HoldingRecordController(HoldingRecordService service) {
        this.service = service;
    }

    @PostMapping
    public HoldingRecordModel add(@RequestBody HoldingRecordModel model) {
        return service.add(model);
    }

    @GetMapping("/investor/{investorId}")
    public List<HoldingRecordModel> getByInvestor(
            @PathVariable Long investorId) {
        return service.getByInvestor(investorId);
    }
}
