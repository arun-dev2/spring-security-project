package com.mvc.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	
	// internally viewresolver is called by spring and try to find the return jsp page
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "hello-world";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello Arun";
	}
	
	@GetMapping("/bye")
	@ResponseBody
	public String bye() {
		return "bye Arun";
	}
}
