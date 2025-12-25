package com.example.demo.service.impl;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.repository.AllocationSnapshotRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationSnapshotServiceImpl implements AllocationSnapshotService {

    private final AllocationSnapshotRecordRepository repo;

    public AllocationSnapshotServiceImpl(AllocationSnapshotRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public AllocationSnapshotRecord save(AllocationSnapshotRecord record) {
        return repo.save(record);
    }

    @Override
    public List<AllocationSnapshotRecord> getByInvestorId(Long investorId) {
        return repo.findByInvestorId(investorId);
    }
}
