package com.rajesh.dao;

import java.util.List;

import com.rajesh.entity.UserInfo;

public interface UserDAO {

	boolean addUser(UserInfo userInfo) throws Exception;	
	
	UserInfo findUser(int id) throws Exception;
	
	List<UserInfo> users() throws Exception;
}
