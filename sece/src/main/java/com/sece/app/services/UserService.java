package com.sece.app.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sece.app.models.User;
import com.sece.app.repositories.UserRepository;
import com.sece.app.util.CustomError;

@Service
public class UserService {

//	UserRepository repo = new UserRepository(); //this is manual object creation
	
	@Autowired
	UserRepository repo;
	
	public CustomError registerService(User newUser) {
		return repo.createUser(newUser);
	}
	
	public CustomError loginService(int id, String email, String pass) {
		return repo.loginUser(id, email, pass);
	}
	
	public ArrayList<User> showAllService() {
		return repo.showAll();
	}
	public User showOneService(int id) {
		return repo.showOne(id);
	}
}
