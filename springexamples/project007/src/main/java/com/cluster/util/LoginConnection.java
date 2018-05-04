package com.cluster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginConnection {
          static Connection cn=null;
	public static Connection getConnection(){
		 try{
		Class.forName("org.postgresql.Driver");
		cn=DriverManager.getConnection("jdbc:postgresql:bharatpg","postgres","cluster");
		
		 }catch(ClassNotFoundException  se){
			  }
		 catch (SQLException e ) {
			
		}
		return cn;
	}
	
}
