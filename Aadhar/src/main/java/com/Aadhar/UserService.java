package com.Aadhar;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDao ud;
	public String postadd(User u) {
		return ud.postadd(u);
		
	}

}
