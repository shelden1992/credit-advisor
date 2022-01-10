package com.bobocode.creadit_advisor.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "applicants")
public class Applicant extends SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "social_security_number", nullable = false)
    @NaturalId
    private String ssn;

    @Column(name = "address")
    @Embedded
    private Address address;

    @ElementCollection
    @CollectionTable(name = "applicant_phones", joinColumns = @JoinColumn(name = "applicant_id"), indexes = @Index(name = "application_phones_applicant_id_idx", columnList = "applicant_id"))
    private List<Phone> phones = new ArrayList<>();

    @OneToMany(mappedBy = "applicant")
    @JsonBackReference
    private List<Application> applications;
}
