package com.example.demo.service;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.repository.HoldingRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoldingRecordServiceImpl implements HoldingRecordService {

    private final HoldingRecordRepository repo;

    public HoldingRecordServiceImpl(HoldingRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public HoldingRecord save(HoldingRecord record) {
        return repo.save(record);
    }

    @Override
    public List<HoldingRecord> getByInvestorId(String investorId) {
        return repo.findByInvestorId(investorId);
    }
}
