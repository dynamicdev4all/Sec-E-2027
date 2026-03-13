package com.sece.app.models;

public class User {
	public boolean isBanned() {
		return isBanned;
	}

	public void setBanned(boolean isBanned) {
		this.isBanned = isBanned;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public User(int id, String name, String email, String pass, long phone, String address, String upi) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.upi = upi;
		this.email = email;
		this.pass = pass;
		this.isBanned = false;		
	}
	
	User(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
	int id;
	String name;
	long phone;
	String address;
	String upi;
	String email;
	String pass;
	boolean isBanned;
}
