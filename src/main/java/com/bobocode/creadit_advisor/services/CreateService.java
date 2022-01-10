package com.bobocode.creadit_advisor.services;

import com.bobocode.creadit_advisor.repository.AdvisorRepository;
import com.bobocode.creadit_advisor.repository.ApplicantRepository;
import com.bobocode.creadit_advisor.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */
@Service
@RequiredArgsConstructor
public class CreateService {
    private final AdvisorRepository advisorRepository;
    private final ApplicationRepository applicationRepository;
    private final ApplicantRepository applicantRepository;



}
