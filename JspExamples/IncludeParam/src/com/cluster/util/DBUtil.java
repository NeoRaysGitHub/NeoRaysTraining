package com.cluster.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
	public static Connection getConnectToOracle() throws ClassNotFoundException, SQLException {

		Connection con=null;
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver is loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","deepaoracle","deepaoracle");
			System.out.println("got connection");
		
		return con;
	}
	

}
