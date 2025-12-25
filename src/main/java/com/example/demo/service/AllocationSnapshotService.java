package com.example.demo.service;

import com.example.demo.entity.AllocationSnapshotRecord;
import java.util.List;

public interface AllocationSnapshotService {
    List<AllocationSnapshotRecord> getSnapshotsByInvestor(Long investorId);
}
