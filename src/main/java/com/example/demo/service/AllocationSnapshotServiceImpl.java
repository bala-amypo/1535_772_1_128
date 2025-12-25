package com.example.demo.service;

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

    public List<AllocationSnapshotRecord> getSnapshotsByInvestor(Long investorId) {
        return repo.findByInvestorId(investorId);
    }
}
