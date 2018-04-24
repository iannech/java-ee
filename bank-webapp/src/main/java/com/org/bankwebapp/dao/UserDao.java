package com.org.bankwebapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.org.bankwebapp.domain.User;

public interface UserDao extends CrudRepository<User, Long> {

	// Springboot uses findBy+Username and findBy+Email to know where are looking
	// for username or email in User object
	User findByUsername(String username);
	User findByEmail(String email);
}
