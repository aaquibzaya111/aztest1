package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repo.UserRepo;

@Service

public class UserService {
	@Autowired
	private UserRepo repo;
	
	public void saveUser(User u) {
		repo.save(u);
	}
}
