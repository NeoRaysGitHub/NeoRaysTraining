package com.neorays.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.taglibs.standard.tag.common.core.CatchTag;



public class LoginService {
	
	
	public boolean check(String uname,String pwd)
	{
	try{
		
		System.out.println("inside DBUtil");
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded");
		Connection con =DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/EMP", "postgres", "neorays");
		System.out.println("got connection");
		
		
		
		 PreparedStatement pst= con.prepareStatement("SELECT * FROM employee WHERE name=? and password=?");

		 System.out.println("inside pst");
		// inserting a row
		pst.setString(1, uname);
		pst.setString(2, pwd);
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			return true;
		}
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	}
	

}
