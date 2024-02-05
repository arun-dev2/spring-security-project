package com.mvc.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.security.dao.SignUpDao;
import com.mvc.security.dto.SignUpDto;

@Controller
public class LoginController {

	@Autowired
	private SignUpDao signUpDao;

	@Autowired
	private PasswordEncoder bcryptPasswordEncoder;

	@GetMapping("/signin")
	public String customLogin() {
		return "Login";
	}

	@GetMapping("/signup")
	public String getSignup(@ModelAttribute("signUpDto") SignUpDto signUpDto) {
		return "Signup";
	}

	@PostMapping("/process-signup")
	public String processSignUp(SignUpDto signUpDto) {

		String encodedPassword = bcryptPasswordEncoder.encode(signUpDto.getPassword());
		signUpDto.setPassword(encodedPassword);

		// saving signup dto logic into db.
		// 1. DAO layer - signup dao interface -> its impl
		// 2. JDBC template .update to add row in db

		signUpDao.saveUser(signUpDto);

		return "redirect:/signin";
	}

}
