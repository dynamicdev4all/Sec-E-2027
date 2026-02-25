package com.sece.app.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sece.app.models.User;
import com.sece.app.repositories.UserRepository;

@Service
public class UserService {

//	UserRepository repo = new UserRepository(); //this is manual object creation
	
	@Autowired
	UserRepository repo;
	
	public User registerService(User newUser) {
		return repo.createUser(newUser);
	}
	
	public User loginService(int id, String email, String pass) {
		return repo.loginUser(id, email, pass);
	}
	
	public ArrayList<User> showAllService() {
		return repo.showAll();
	}
	public User showOneService(int id) {
		return repo.showOne(id);
	}
}
