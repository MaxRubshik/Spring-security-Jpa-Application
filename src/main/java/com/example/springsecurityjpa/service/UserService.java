package com.example.springsecurityjpa.service;

import com.example.springsecurityjpa.model.User;
import com.example.springsecurityjpa.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
