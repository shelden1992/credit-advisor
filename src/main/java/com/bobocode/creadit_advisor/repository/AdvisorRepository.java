package com.bobocode.creadit_advisor.repository;

import com.bobocode.creadit_advisor.domain.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */
@Repository
public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
}
