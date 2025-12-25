package com.example.demo.service;

import com.example.demo.entity.InvestorProfile;

public interface InvestorProfileService {
    InvestorProfile createInvestor(InvestorProfile investor);
    InvestorProfile getInvestor(Long id);
}
