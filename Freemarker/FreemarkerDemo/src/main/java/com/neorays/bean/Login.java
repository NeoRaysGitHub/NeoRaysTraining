package com.neorays.bean;

public class Login {
private String username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	System.out.println("Bean Setter method");
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
