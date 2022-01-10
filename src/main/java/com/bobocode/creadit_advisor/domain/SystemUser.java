package com.bobocode.creadit_advisor.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Shelupets Denys on 10.01.2222.
 */

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(of = "cognitoUserName")
public abstract class SystemUser {
    @Column(name = "cognito_user_name", nullable = false, updatable = false, unique = true)
    @NaturalId
    private String cognitoUserName;
    @Column(name = "email", unique = true)
    private String email;
}
