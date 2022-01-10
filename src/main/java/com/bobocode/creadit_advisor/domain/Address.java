package com.bobocode.creadit_advisor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;
    private String number;
    private String apt;
    private String zip;

}
