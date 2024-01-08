package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.User;
import com.test.service.UserService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private UserService service;
	@RequestMapping("/view")
	public String view() {
		return "lead";
	}
	@RequestMapping("/call")
	public String saveUser(User u) {
		service.saveUser(u);
		
		
		return "lead";
	}

}
