package com.sece.app.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sece.app.models.User;
import com.sece.app.util.CustomError;

@Repository
public class AdminRepository {
	
	@Autowired
	UserRepository repo;
	public CustomError manageAccess(int id) {
		User user = repo.showOne(id);
		
		if(user.isBanned() == false) {
			user.setBanned(true);
			return new CustomError("SUCCESS", "The user " + user.getEmail() + " is banned successfully");
		}
		else {
			user.setBanned(false);
			return new CustomError("SUCCESS", "The user " + user.getEmail() + " is successfully un-banned");
		}
		
	}
}
