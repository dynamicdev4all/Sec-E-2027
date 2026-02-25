package com.sece.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sece.app.models.User;


@Repository
public class UserRepository {
	Map<Integer, User> db = new HashMap<Integer, User>();
	int current = 1;
	
	public User createUser(User newUser) {
		try {
			db.put(current, newUser);
			current ++;
			return newUser;
		} catch (Exception e) {
			return null;
		}
	}
	
	public User loginUser(int id, String email, String pass) {
		User user = db.get(id);
		if(user != null) {
			if(user.getEmail().equals(email) && user.getPass().equals(pass)) {
				return user;
			}
		}
		return null;
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
