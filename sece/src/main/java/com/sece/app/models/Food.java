package com.sece.app.models;

public class Food {
	public Food(long id, String name, float price, String desc, String ratings) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.ratings = ratings;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	long id;
	String name;
	float price;
	String desc;
	String ratings;
}
