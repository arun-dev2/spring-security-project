package com.mvc.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * This class is used to create spring security filter chains (fileter layers for request)
 */

@EnableWebSecurity //(debug=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// create user details to byepass login page
	
	@Autowired
	private PasswordEncoder bcryptPasswordEncoder;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("arun")
		.password("$2a$10$uFPnb/VrV.Eua7vBzP8OYeeUIYeiRd6xGTOb8xh6vOhcW1nuIeDtO")
		.roles("Administrator");
		
		//System.out.println("password encode value : "+bcryptPasswordEncoder.encode("1234"));
	}
	
}
