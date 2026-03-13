package com.sece.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sece.app.services.AdminService;
import com.sece.app.util.CustomError;

@RestController
public class AdminController {
	
	
	@Autowired
	AdminService service;
	
	@PatchMapping("/admin/manage_access/{id}")
	public String manageUserAccess(@PathVariable int id) {
		CustomError log =  service.ban_unban_user(id);
		return log.getMsg();
	}
}
