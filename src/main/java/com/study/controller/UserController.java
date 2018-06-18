package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userService;
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "login";
	}
	
}
