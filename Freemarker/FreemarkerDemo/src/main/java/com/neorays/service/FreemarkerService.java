package com.neorays.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neorays.bean.Login;

@Service("service")
public class FreemarkerService {
	
	public String login(Login login){
		return null;
		
	}
	public List getList(){
		System.out.println("Service Method");
		ArrayList list = new ArrayList();
		list.add("Suresh");
		list.add("Hair");
		list.add("Mittu");
		list.add("barath");		
		return list;
		
	}
	
}
