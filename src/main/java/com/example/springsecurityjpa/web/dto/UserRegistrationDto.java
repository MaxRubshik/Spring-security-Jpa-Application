package com.example.springsecurityjpa.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegistrationDto {

    private String fistName;
    private String lastName;
    private String password;
    private String email;
}
