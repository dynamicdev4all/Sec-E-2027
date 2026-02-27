package com.sece.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sece.app.models.Food;

@Repository
public class RestaurantRepository {
	Map<Long, ArrayList<Food>> menuMap = new HashMap<Long ,ArrayList<Food>>();
	
	public String addItem(long restId, long foodId, String foodName, float foodPrice, String foodDesc, String foodRatings) {
		Food newItem = new Food(foodId, foodName, foodPrice, foodDesc, foodRatings);
		
		//this is the case if the item is not the first item
		if(menuMap.containsKey(restId)) {
			menuMap.get(restId).add(newItem);
			
			return "Item added successfully.";
		}
		//this is the first item of the rest.
		else {
			ArrayList<Food> menuList = new ArrayList<Food>();
			
			menuList.add(newItem);
			
			menuMap.put(restId, menuList);
			
			return "First Item added successfully.";
		}
		
	}
	
	public ArrayList<Food> showMenu(long restId) {
		return menuMap.get(restId);
	}
}
