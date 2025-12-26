package com.example.demo.service.impl;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AllocationSnapshotRecordRepository;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationSnapshotServiceImpl implements AllocationSnapshotService {

    private final AllocationSnapshotRecordRepository repository;

    public AllocationSnapshotServiceImpl(AllocationSnapshotRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public AllocationSnapshotRecord save(AllocationSnapshotRecord record) {
        return repository.save(record);
    }

    @Override
    public List<AllocationSnapshotRecord> getByInvestorId(String investorId) {
        return repository.findByInvestorId(investorId);
    }

    @Override
    public AllocationSnapshotRecord getById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Snapshot not found: " + id));
    }

    @Override
    public List<AllocationSnapshotRecord> getAll() {
        return repository.findAll();
    }
}
