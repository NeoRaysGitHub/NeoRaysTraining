package com.neo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String welcomeMessage(String name){
		return "Mr/Mrs "+name +" Welcome to Spring MVC World!!!";
	}
	
}
