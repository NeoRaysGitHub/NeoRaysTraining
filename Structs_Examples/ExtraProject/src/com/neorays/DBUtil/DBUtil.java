package com.neorays.DBUtil;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	public class DBUtil{
		
		public static Connection con=null;
		public static Connection getConnection()  {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					System.out.println("Driver is loaded");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sachinoracle","sachinoracle");
					System.out.println("Got connection");
				
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
				
		}
	}


