package com.example.demo.service;

import com.example.demo.model.HoldingRecordModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoldingRecordServiceImpl
        implements HoldingRecordService {

    @Override
    public HoldingRecordModel add(HoldingRecordModel model) {
        return model;
    }

    @Override
    public List<HoldingRecordModel> getByInvestor(Long investorId) {
        return new ArrayList<>();
    }
}
