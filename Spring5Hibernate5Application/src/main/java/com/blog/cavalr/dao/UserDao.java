package com.blog.cavalr.dao;

import com.blog.cavalr.entity.User;

import java.util.List;

public interface UserDao extends AbstractDao<User, String> {
    
    List<User> getAllUserList();
}
