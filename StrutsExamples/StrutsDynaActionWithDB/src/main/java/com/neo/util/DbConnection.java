package com.neo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
public static Connection getConnection() throws ClassNotFoundException, SQLException{
	String url = "jdbc:postgresql://localhost:5432/suresh";
	String username = "postgres";
	String password = "cluster";
	Class.forName("org.postgresql.Driver");
	return DriverManager.getConnection(url, username, password);						
}
}
