package com.vitorcd20.job_management.modules.candidate.controllers;


import com.vitorcd20.job_management.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity){

    }

}
