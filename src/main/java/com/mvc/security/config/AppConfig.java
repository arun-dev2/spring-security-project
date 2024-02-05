package com.mvc.security.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	
	
	@Bean
	PasswordEncoder getPasswordEncode(){
		//return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
		
	}
	
	
	// creating jdbc template requires data source
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
	
	// establishing db connection : need Datasource
	
	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("123465789");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/userinfo");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

		return driverManagerDataSource;
	}
	

}
