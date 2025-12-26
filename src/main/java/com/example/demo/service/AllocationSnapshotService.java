package com.example.demo.service;

import com.example.demo.entity.AllocationSnapshotRecord;

import java.util.List;

public interface AllocationSnapshotService {

    AllocationSnapshotRecord computeSnapshot(String investorId);

    AllocationSnapshotRecord getSnapshotById(String id);

    List<AllocationSnapshotRecord> getAllSnapshots();
}
