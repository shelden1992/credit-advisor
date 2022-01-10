package com.bobocode.creadit_advisor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Phone {
    @Column(nullable = false)
    private String number;
    @Enumerated(value = EnumType.STRING)
    private Type type;

    public enum Type {
        HOME, WORK, MOBILE
    }
}