package com.mvc.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/bye")
	@ResponseBody
	public String bye() {
		return "bye";
	}
	
	@GetMapping("/trainer")
	public String trainerPage() {
		return "Trainer-dashboard";
	}
	
	@GetMapping("/developer")
	public String developerPage() {
		return "Developer-dashboard";
	}
}
