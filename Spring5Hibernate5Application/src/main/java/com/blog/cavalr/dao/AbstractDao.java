package com.blog.cavalr.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<E, I extends Serializable> {

    List<E> getUserList();
}
