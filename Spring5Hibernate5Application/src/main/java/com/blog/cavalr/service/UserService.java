package com.blog.cavalr.service;

import com.blog.cavalr.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUserList();
    Boolean saveUser(User user);
}
