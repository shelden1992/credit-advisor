package com.bobocode.creadit_advisor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * Created by Shelupets Denys on 10.01.2022.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "applications", indexes = {
        @Index(name = "applications_applicant_id_id", columnList = "applicant_id"),
        @Index(name = "applications_advisor_id_id", columnList = "advisor_id")
})
public class Application {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column(name = "date_created", nullable = false)
    private LocalDateTime dateCreated;

    @Column(name = "date_assigned", nullable = false)
    private LocalDateTime dateAssigned;

    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_id")
    private Applicant applicant;

    public void assignTo(Advisor advisor) {
        verifyIsNotAssigned();
        this.advisor = advisor;
        this.status = Status.ASSIGNED;
        this.dateAssigned = LocalDateTime.now();
    }

    private void verifyIsNotAssigned() {
        if (this.advisor != null) {
            throw new IllegalArgumentException("Applications is already assigned");
        }
    }


    public enum Status {
        NEW, ASSIGNED, APPROVED, CANCELED, DECLINED
    }
}
