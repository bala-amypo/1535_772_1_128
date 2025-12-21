package com.example.demo.controller;

import com.example.demo.model.HoldingRecordModel;
import com.example.demo.service.HoldingRecordService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holdings")
public class HoldingRecordController {

    private final HoldingRecordService holdingService;

    public HoldingRecordController(HoldingRecordService holdingService) {
        this.holdingService = holdingService;
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<HoldingRecordModel> add(@RequestBody HoldingRecordModel model) {
        return ResponseEntity.ok(holdingService.add(model));
    }

    @GetMapping(
        value = "/investor/{investorId}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<HoldingRecordModel>> getByInvestor(
            @PathVariable Long investorId) {
        return ResponseEntity.ok(holdingService.getByInvestor(investorId));
    }
}
