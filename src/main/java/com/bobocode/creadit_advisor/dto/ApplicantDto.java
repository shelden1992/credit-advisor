package com.bobocode.creadit_advisor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String ssn;
    private String address;
    private List<PhoneDto> phones = new ArrayList<>();
    private String userName;
    private String mail;

    public void addPhone(PhoneDto phone) {
        phone.setApplicant(this);
        phones.add(phone);
    }


}
