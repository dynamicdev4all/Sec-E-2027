package com.sece.app.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sece.app.models.Food;
import com.sece.app.repositories.RestaurantRepository;


@RestController
public class RestaurantController {
	
	@Autowired
	RestaurantRepository restRepo;
	
	
	@PostMapping("/restaurant/createItem")
	public String createMenuItem(@RequestBody Map<String, String> data) {
		long foodId = Long.valueOf(data.get("foodId"));
		String foodName = data.get("foodName");
		float foodPrice = Float.valueOf(data.get("foodPrice"));
		String foodDesc = data.get("foodDesc");
		String foodRatings = data.get("foodRatings");
		long restId = Long.valueOf(data.get("restId"));
		
		return restRepo.addItem(restId, foodId, foodName, foodPrice, foodDesc, foodRatings);
		
	}
	
	@GetMapping("/restaurant/showMenu/{restId}")
	public ArrayList<Food> showMenuItem(@PathVariable long restId) {
		return restRepo.showMenu(restId);
	}
}
