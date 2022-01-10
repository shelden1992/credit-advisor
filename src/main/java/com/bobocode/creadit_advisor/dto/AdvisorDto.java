package com.bobocode.creadit_advisor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdvisorDto {
    private Long id;
    private List<ApplicationDto> applications;
    private String role;
    private String userName;
    private String mail;
}
