package com.org.bankwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.bankwebapp.dao.UserDao;
import com.org.bankwebapp.domain.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		userDao.save(user);
	}
	
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
	
	public boolean checkUserExists(String username, String email) {
		if(checkUsernameExists(username) || checkEmailExists(email)) {
			return true;
		}else {
		
			return false;
		}	
	}
	
	public boolean checkUsernameExists(String username) {
		if( null != findByUsername(username)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkEmailExists(String email) {
		if(null != findByEmail(email)) {
			return true;
		}else {
			return false;
		}
	}
}

