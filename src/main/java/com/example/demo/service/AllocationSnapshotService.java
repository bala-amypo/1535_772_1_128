package com.example.demo.service;

import com.example.demo.entity.AllocationSnapshotRecord;
import java.util.List;

public interface AllocationSnapshotService {

    AllocationSnapshotRecord save(AllocationSnapshotRecord record);

    List<AllocationSnapshotRecord> getByInvestorId(String investorId);

    AllocationSnapshotRecord getById(String id);

    List<AllocationSnapshotRecord> getAll();
}
