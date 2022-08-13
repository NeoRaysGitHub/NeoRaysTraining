package com.neorays.service;

import java.sql.SQLException;
import java.util.List;

import com.neorays.dao.LoginDAO;

public class LoginService {

	private LoginDAO dao;
	
	public void setDao(LoginDAO dao) {
		this.dao = dao;
	}

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
	
	public  String delete(String user) throws ClassNotFoundException, SQLException{
		int count=0;
		count=dao.delete(user);
		if(count!=0){
			return "Record is deleted";
		}
		else
			return "Record is not deleted";
	}
	
	public  String update(String oldval,String newval) throws ClassNotFoundException, SQLException{
		int count=0;
		count=dao.update(oldval,newval);
		if(count!=0){
			return "Record is deleted";
		}
		else
			return "Record is not deleted";
	}
	
}//class
