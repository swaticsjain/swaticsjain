package com.rajesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajesh.dao.UserDAO;
import com.rajesh.entity.UserInfo;

@Controller
public class UserController {

	@Autowired
	private UserDAO dao;
	
	@RequestMapping("/")
	public String listUsers(ModelMap map){				// modelmap provides data to view
	
		try{
			List<UserInfo> users = dao.users();
			
			map.addAttribute("users", users);
			
			return "users";
		}
		catch(Exception ex){
			
			map.addAttribute("exception", ex);
			
			return "error";
		}
	}
	
	@RequestMapping("/users")
	public String users(ModelMap map){				// same as above method, just for providing a different url
	
		try{
			List<UserInfo> users = dao.users();
			
			map.addAttribute("users", users);
			
			return "users";
		}
		catch(Exception ex){
			
			map.addAttribute("exception", ex);
			
			return "error";
		}
	}
	
	// call it as:    http://localhost:8888/rajesh/user?id=1
	
	@RequestMapping("/user")
	public String findUser(Integer id, ModelMap map){				
	
		try{
			UserInfo user = dao.findUser(id);
			
			map.addAttribute("user", user);
			
			return "user";
		}
		catch(Exception ex){
			
			map.addAttribute("exception", ex);
			
			return "error";
		}
		
	}
	
	@RequestMapping("/createuser")
	public String createUser(){
		return "createuser";
	}
	
	@RequestMapping("/usercreated")
	public String userCreated(){
		return "usercreated";
	}
	
	@RequestMapping("/saveuser")
	public String saveUser(UserInfo userInfo, ModelMap map){				
	
		try{
			boolean saved = dao.addUser(userInfo);
			
			map.addAttribute("saved", saved);
			
			return "redirect:usercreated";
		}
		catch(Exception ex){
			
			map.addAttribute("exception", ex);
			
			return "error";
		}
		
	}
}
