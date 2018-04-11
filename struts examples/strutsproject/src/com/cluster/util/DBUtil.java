package com.cluster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil{
	
	
	public static Connection getpostgresconnection()throws ClassNotFoundException,SQLException{
		
		System.out.println("inside util");
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/employee_project","postgres", "dinesh");
		System.out.println("got connection");
	 return conn;
	}
	
	
}