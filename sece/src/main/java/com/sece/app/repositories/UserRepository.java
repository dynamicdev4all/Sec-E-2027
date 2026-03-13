package com.sece.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sece.app.models.User;
import com.sece.app.util.CustomError;


@Repository
public class UserRepository {
	Map<Integer, User> db = new HashMap<Integer, User>();
	int current = 1;
	
	public CustomError createUser(User newUser) {
		try {
			db.put(current, newUser);
			current ++;
			return new CustomError("SUCCESS", "Regsitration Successful.");
		} catch (Exception e) {
			return new CustomError("ERR", e.toString());
		}
	}
	
	
	
	
	public CustomError loginUser(int id, String email, String pass) {
		User user = db.get(id);
		if(user != null) {
			if(user.isBanned() == false) {
				if(user.getEmail().equals(email) && user.getPass().equals(pass)) {
					return new CustomError("SUCCESS", "Login Successful.");
				}else {
					return new CustomError("FAILED", "Login ID or password does not match.");
				}
			}
			return new CustomError("ERR", "The user is banned");
		}
		return new CustomError("ERR", "The user does not exist");
	}
	
	
	
	
	
	
	
	
	
	public ArrayList<User> showAll() {
		return new ArrayList<User>(db.values());
	}
	
	public User showOne(int id) {
		return db.get(id);
	}
	
	public void deleteUser() {
		
	}
	
	public void updateUser() {
		
	}
	
	public void placeOrder() {
		
	}
	
	public void cancelOrder() {
		
	}
}
