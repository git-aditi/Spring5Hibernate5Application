package com.blog.cavalr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.cavalr.dao.UserDao;
import com.blog.cavalr.dao.impl.UserEsxampleDaoImpl;
import com.blog.cavalr.entity.User;
import com.blog.cavalr.service.UserService;

@Service("userService")

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Autowired
    UserEsxampleDaoImpl userEsxampleDaoImpl;

	public List<User> getAllUserList() {
		return userDao.getAllUserList();
	}
	
	@Transactional
	public Boolean saveUser(User user)
	{
		//Business l;ogic
		userEsxampleDaoImpl.saveDatatoDb(user);
		return Boolean.TRUE;
	}
}
