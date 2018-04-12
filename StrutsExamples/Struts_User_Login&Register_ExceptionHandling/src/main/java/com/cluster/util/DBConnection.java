package com.cluster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String url = "jdbc:postgresql://localhost:5432/suresh";
	static String username = "postgres";
	static String password = "cluster";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
}
