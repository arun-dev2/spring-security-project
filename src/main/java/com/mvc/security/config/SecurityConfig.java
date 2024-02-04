package com.mvc.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
		.withUser("Arun").password("$2a$10$uFPnb/VrV.Eua7vBzP8OYeeUIYeiRd6xGTOb8xh6vOhcW1nuIeDtO").roles("Teacher") // 1234 pswrd
		.and()
		.withUser("Nila").password("$2a$10$5l3S0aqVgkgY8eaEkQRcC.xAy.TWs7xwQ8Z3LcjYjH7.iNzHUkyz2").roles("Student"); //5678 pswrd
		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.authorizeRequests()
		//.anyRequest()
		.antMatchers("/hello")
		.authenticated()
		.antMatchers("/bye").authenticated()   // giving permission byepass to authenticate certain handlers.
		.antMatchers("/helloWorld").permitAll()
		//.antMatchers("/signin").permitAll()
				// .denyAll() // denies all request example - Site under maintenace
				// .permitAll() // permits all controllers without authentication
				
		.and()
		.formLogin().loginPage("/signin")
		.and()
		.httpBasic()
		.and().logout();
	}
	
}
