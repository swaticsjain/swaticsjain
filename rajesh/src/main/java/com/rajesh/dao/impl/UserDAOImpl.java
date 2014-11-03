package com.rajesh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rajesh.dao.UserDAO;
import com.rajesh.entity.UserInfo;

@Transactional
@Repository
public class UserDAOImpl extends HibernateUtil implements UserDAO {

	@Override
	public boolean addUser(UserInfo userInfo) throws Exception {

		Session session = getCurrentSession();
		
		session.save(userInfo);
		
		return true;
	}

	@Override
	public UserInfo findUser(int id) throws Exception {

		Session session = getCurrentSession();
		
		UserInfo userInfo = (UserInfo) session.get(UserInfo.class, id);
		
		return userInfo;
	}

	@Override
	public List<UserInfo> users() throws Exception {

		Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<UserInfo> users = session.createQuery("from UserInfo").list();
		
		return users;
	}

}
