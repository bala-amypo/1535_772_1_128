package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.InvestorProfile;

public interface InvestorProfileService {

    InvestorProfile save(InvestorProfile investor);

    InvestorProfile getByInvestorId(String investorId);

    List<InvestorProfile> getAll();

    InvestorProfile update(String investorId, InvestorProfile investor);

    void delete(String investorId);
}
