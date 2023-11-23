package com.model;

public class User {
	public User() {
		this.isAuthenticated=false;
	}
	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.isAuthenticated = false;
	}
	private String username;
	private String password;
	private Boolean isAuthenticated;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsAuthenticated() {
		return isAuthenticated;
	}
	public void setIsAuthenticated(Boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
}
