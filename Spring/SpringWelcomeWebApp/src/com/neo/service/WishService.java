package com.neo.service;

public class WishService {
	public String sayHello(String name) {
		String msg = null;
		if (name.equals("") && name.trim().length() == 0)
			msg = "Hello Mr/Mrs Guest Welcome to Spring MVC";
		else
			msg = "Hello Mr/Mrs " + name + " Welcome to Spring MVC";
		return msg;
	}
}
