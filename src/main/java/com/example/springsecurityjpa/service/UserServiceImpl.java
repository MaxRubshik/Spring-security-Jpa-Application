package com.example.springsecurityjpa.service;

import com.example.springsecurityjpa.model.Role;
import com.example.springsecurityjpa.model.User;
import com.example.springsecurityjpa.repository.UserRepository;
import com.example.springsecurityjpa.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFistName(),
                registrationDto.getLastName(),
                registrationDto.getPassword(),
                registrationDto.getEmail(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
