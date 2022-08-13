package com.neorays.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.beans.LoginBeans;
import com.neorays.dao.LoginDAO;
@Service
public class LoginService {

	@Autowired
	private LoginDAO dao;
	
	

	public String insert(LoginBeans   beans) throws ClassNotFoundException{
		int count=0;
		//use dao class
		try {
			 count=dao.register(beans);
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
	
	public  String delete(LoginBeans beans) throws ClassNotFoundException, SQLException{
		int count=0;
		count=dao.delete(beans);
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
