package com.vitorcd20.job_management.repository;

import com.vitorcd20.job_management.modules.candidate.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {
    Optional <CandidateEntity> findByUsernameOrEmail(String username, String email);
}
