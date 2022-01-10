package com.bobocode.creadit_advisor.repository;

import com.bobocode.creadit_advisor.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Shelupets Denys on 10.01.2022.
 */
public interface ApplicationRepository extends JpaRepository<Application, Long> {
//    Application findFirstByStatusOrderByCreatedAt(Application.Status status);
}
