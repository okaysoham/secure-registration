package com.soham.springboot.service;

import com.soham.springboot.model.Role;
import com.soham.springboot.model.User;
import com.soham.springboot.repository.UserRepository;
import com.soham.springboot.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User(userRegistrationDto.getFirstName(),
                            userRegistrationDto.getLastName(),
                            userRegistrationDto.getEmail(),
                            userRegistrationDto.getPasswrord(),
                            Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}
