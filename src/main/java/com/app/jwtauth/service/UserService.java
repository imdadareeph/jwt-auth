package com.app.jwtauth.service;

import com.app.jwtauth.model.User;
import com.app.jwtauth.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
