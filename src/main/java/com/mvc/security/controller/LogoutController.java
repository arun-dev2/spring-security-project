package com.mvc.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

	// internally viewresolver is called by spring and try to find the return jsp
	// page
	@GetMapping("/signout")
	public String signout() {
		return "Logout";
	}

}
