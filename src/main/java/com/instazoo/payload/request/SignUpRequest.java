package com.instazoo.payload.request;

import com.instazoo.annotation.PasswordMatches;
import com.instazoo.annotation.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignUpRequest {

    @NotEmpty(message = "Please enter your username")
    private String username;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
    @NotEmpty(message = "Please enter your first firstname")
    private String firstname;
    @NotEmpty(message = "Please enter your last lastname")
    private String lastname;
    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
}
