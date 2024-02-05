package com.mvc.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.security.dto.SignUpDto;

@Repository
public class SignUpDaoImpl implements SignUpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveUser(SignUpDto signUpDto) {
		String sql = "Insert into users values(?,?,?)";
		String sql1 = "Insert into authorities values(?,?)";
		jdbcTemplate.update(sql, signUpDto.getUsername(),signUpDto.getPassword(),1);
		jdbcTemplate.update(sql1, signUpDto.getUsername(),signUpDto.getRole());

	}

}
