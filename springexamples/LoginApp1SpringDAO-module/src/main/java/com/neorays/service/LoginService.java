package com.neorays.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.dao.LoginDAO;
@Service
public class LoginService {

	@Autowired
	private LoginDAO dao;
	
	

	public String insert(String user,String pass) throws ClassNotFoundException{
		int count=0;
		//use dao class
		try {
			 count=dao.register(user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count==0)
		return "RECORD IS NOT INSERTED";
		else
			return "RECORD INSERTED";
	}//INSERT METHOD
	
	public List  select() throws ClassNotFoundException, SQLException{
		
		List list=null;
		//use dao
		list=dao.select();
		return list;
	}//select method
public List  selectOneData(){
		
		List list=null;
		//use dao
		list=dao.selectOne();
		return list;
	}//select method
	
}