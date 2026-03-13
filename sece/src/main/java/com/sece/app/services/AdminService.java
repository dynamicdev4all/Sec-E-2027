package com.sece.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sece.app.repositories.AdminRepository;
import com.sece.app.util.CustomError;

@Service
public class AdminService {
	@Autowired
	AdminRepository repo;
	public CustomError ban_unban_user(int id) {
		return repo.manageAccess(id);
	}
}
