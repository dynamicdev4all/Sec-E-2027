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
import com.sece.app.util.CustomError;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {
	
	
	@Autowired
	UserService service;
	//Register
	
	@PostMapping("/user/register")
	public String createUser(@RequestBody Map<String, String> registerUser) {
		int id = Integer.parseInt(registerUser.get("id"));
		String name = registerUser.get("name");
		long phone = Long.parseLong(registerUser.get("phone"));
		String add = registerUser.get("address");
		String upi = registerUser .get("upi");
		String email = registerUser .get("email");
		String pass = registerUser .get("pass");
		
		
		User newUser = new User(id, name, email, pass, phone, add, upi);
		CustomError user = service.registerService(newUser);
		return user.getMsg();
	}
	
	@PostMapping("/user/login")
	public String login(int id, @RequestBody Map<String, String> loginUser) {
		CustomError log =  service.loginService(id, loginUser.get("email"), loginUser.get("pass"));	
		return log.getMsg();
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
