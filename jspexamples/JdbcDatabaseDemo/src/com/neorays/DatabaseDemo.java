package com.neorays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {
	int emp_id;
	String name;
	float salary;
	
	static Connection connection;
	static Statement statement;
	static PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public static void lodeDrive(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BANDHUORACLE", "system");
			statement=connection.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void show(){
		try {
			resultSet=statement.executeQuery("select * from emp");
			while(resultSet.next()){
				emp_id=resultSet.getInt(1);
				name=resultSet.getString(2);
				salary=resultSet.getFloat(3);
				System.out.println(emp_id+"--"+name+"--"+salary);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		DatabaseDemo dd=new DatabaseDemo();
		dd.lodeDrive();
		dd.show();
	}

}
