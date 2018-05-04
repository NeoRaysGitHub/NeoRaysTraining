package com.cluster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginConnection {
           static Connection con=null;
	public static Connection getConnection(){
		try {
			Class.forName("org.postgresql.Driver");
			try {
				con=DriverManager.getConnection("jdbc:postgresql:bharatpg","postgres","cluster");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	  return con;
	}
}
