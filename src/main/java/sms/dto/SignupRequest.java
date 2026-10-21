package sms.dto;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SignupRequest (

    @NotBlank String username,
    @Email @NotBlank String email,
    @Size(min = 8) String password
){}
