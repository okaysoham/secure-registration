package com.soham.springboot.service;

import com.soham.springboot.model.User;
import com.soham.springboot.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto userRegistrationDto);

}
