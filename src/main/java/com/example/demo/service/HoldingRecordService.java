package com.example.demo.service;

import com.example.demo.entity.HoldingRecord;

import java.util.List;

public interface HoldingRecordService {

    HoldingRecord create(HoldingRecord record);

    List<HoldingRecord> getAll();

    HoldingRecord getById(Long id);

    HoldingRecord update(Long id, HoldingRecord record);

    void delete(Long id);
}
