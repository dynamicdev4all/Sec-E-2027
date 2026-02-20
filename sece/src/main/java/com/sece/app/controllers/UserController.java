package com.sece.app.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sece.app.models.User;
import com.sece.app.services.UserService;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {
	
	
	@Autowired
	UserService service;
	//Register
	
	@PostMapping("/user/register")
	public String createUser(@RequestBody User newUser) {
		User user = service.registerService(newUser);
		if(user != null) {
			return "Registration Successful.";
		}
		return "Registration Failed.";
	}
	
	//Show All
	
	@GetMapping("/user/showAll")
	public ArrayList<User> showAll(){
		return service.showAllService();
	}
	//Show One
	@GetMapping("/user/showOne/{id}")
	public User showOne(@PathVariable int id) {
		return service.showOneService(id);
	}
}
