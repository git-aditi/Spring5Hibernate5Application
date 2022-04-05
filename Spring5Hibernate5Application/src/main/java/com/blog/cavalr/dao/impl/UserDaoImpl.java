package com.blog.cavalr.dao.impl;

import com.blog.cavalr.dao.UserDao;
import com.blog.cavalr.entity.User;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }

	public List<User> getAllUserList() {

		return getUserList();
	}
}
