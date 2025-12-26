package com.example.demo.service.impl;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.repository.HoldingRecordRepository;
import com.example.demo.service.HoldingRecordService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HoldingRecordServiceImpl implements HoldingRecordService {

    private final HoldingRecordRepository repository;

    public HoldingRecordServiceImpl(HoldingRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public HoldingRecord save(HoldingRecord record) {
        return repository.save(record);
    }

    @Override
    public List<HoldingRecord> getByInvestorId(String investorId) {
        return repository.findByInvestorId(investorId);
    }

    @Override
    public Optional<HoldingRecord> getById(String id) {
        return repository.findById(id);
    }
}
