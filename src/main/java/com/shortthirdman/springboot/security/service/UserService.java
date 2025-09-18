package com.shortthirdman.springboot.security.service;

import com.shortthirdman.springboot.security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getUsers();

    User save(User user);
}
