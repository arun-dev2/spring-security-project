package com.mvc.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class AppConfig {
	
	@Bean // automatically called by spring, and whenever ths method called then view will be respond backs
	InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vs = new InternalResourceViewResolver();
		vs.setPrefix("/WEB-INF/views/");
		vs.setSuffix(".jsp");
		
		return vs;
		
	}

}
