package com.mvc.security.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * This class is used to create spring security filter chains (fileter layers for request)
 */

@EnableWebSecurity //(debug=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

}
