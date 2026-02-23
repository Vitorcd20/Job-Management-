package com.vitorcd20.job_management.controllers;


import com.vitorcd20.job_management.exceptions.UserFoundException;
import com.vitorcd20.job_management.modules.candidate.CandidateEntity;
import com.vitorcd20.job_management.repository.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping("/")
     public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity){
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

     return this.candidateRepository.save(candidateEntity);
    }

}
