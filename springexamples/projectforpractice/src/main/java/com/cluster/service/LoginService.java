package com.cluster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cluster.DAO.LoginDAO;

@Service
public class LoginService {
	@Autowired
	LoginDAO dao;
	public String insert(String user,String pass,String mail){
		int count=0;
		System.out.println("Service....."+user);
		count=dao.insert(user, pass, mail);
		if(count==0){
			return "Record is not Inserted";
		}
		else
			return "Record Is Inserted";
		
	}

}
