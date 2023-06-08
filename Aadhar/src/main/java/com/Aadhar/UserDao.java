package com.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	UserRepo ur;
	public String postadd(User u) {
		ur.save(u);
		return "Saved successfully";
	}

}
