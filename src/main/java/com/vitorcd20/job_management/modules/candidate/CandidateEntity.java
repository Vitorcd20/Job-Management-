package com.vitorcd20.job_management.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String Name;

    @Pattern(regexp = "\\S+", message = "The [username] field must not contain a space")
    private String username;
    @Email(message = "The [email] field must contain a valid email")
    private String email;

    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;
}
