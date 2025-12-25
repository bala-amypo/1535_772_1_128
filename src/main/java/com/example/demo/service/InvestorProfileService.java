package com.example.demo.service;

import com.example.demo.entity.InvestorProfile;
import java.util.List;

public interface InvestorProfileService {
    InvestorProfile save(InvestorProfile investor);
    InvestorProfile getByInvestorId(String investorId);
    List<InvestorProfile> getAll();
    InvestorProfile update(Long id, InvestorProfile investor);
    void delete(Long id);
}
