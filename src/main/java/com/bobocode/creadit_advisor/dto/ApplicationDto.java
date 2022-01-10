package com.bobocode.creadit_advisor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * Created by Shelupets Denys on 10.01.2022.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationDto {
    private Long id;
    private String status;
    private Timestamp dateCreated;
    private Timestamp dateAssigned;
    private BigDecimal amount;
    private AdvisorDto advisor;

}
