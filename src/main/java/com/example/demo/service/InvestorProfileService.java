package com.example.demo.service;

import com.example.demo.entity.InvestorProfile;
import java.util.*;

public interface InvestorProfileService {

    InvestorProfile save(InvestorProfile investor);

    InvestorProfile getById(String id);

    Optional<InvestorProfile> getByInvestorId(String investorId);

    List<InvestorProfile> getAll();

    InvestorProfile update(String id, InvestorProfile investor);

    void delete(String id);
}
