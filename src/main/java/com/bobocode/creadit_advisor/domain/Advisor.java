package com.bobocode.creadit_advisor.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "advisors")
public class Advisor extends SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "advisor")
    @JsonBackReference
    private List<Application> applications;
    @Enumerated(value = EnumType.STRING)
    private Role role;

    public void assignApplication(Application application) {
        application.assignTo(this);
        applications.add(application);
    }

    public enum Role {
        ASSOCIATE, PARTNER, LEAD
    }
}


