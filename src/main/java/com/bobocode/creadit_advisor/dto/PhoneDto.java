package com.bobocode.creadit_advisor.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDto {
    private Long Id;
    private ApplicantDto applicant;
    private String type;
}