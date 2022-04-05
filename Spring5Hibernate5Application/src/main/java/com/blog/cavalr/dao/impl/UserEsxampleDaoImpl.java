package com.blog.cavalr.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.cavalr.entity.User;

@Repository
public class UserEsxampleDaoImpl {

	    @Autowired
	    private SessionFactory sessionFactory;
	    
	    public void saveDatatoDb(User user)
	    {
	    	sessionFactory.getCurrentSession().saveOrUpdate(user);
	    }
	
}
