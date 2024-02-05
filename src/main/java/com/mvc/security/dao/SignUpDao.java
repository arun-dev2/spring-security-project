package com.mvc.security.dao;

import com.mvc.security.dto.SignUpDto;

public interface SignUpDao {
	
	void saveUser(SignUpDto signUpDto);
}
