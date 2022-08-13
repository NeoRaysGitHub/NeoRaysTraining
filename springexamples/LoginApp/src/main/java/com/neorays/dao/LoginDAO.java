package com.neorays.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.neorays.beans.LoginBeans;

@Repository
public class LoginDAO {
	  static Connection con;
	 public Connection getConnection() throws ClassNotFoundException, SQLException{
		
		 //register jdbc driver
		 Class.forName("org.postgresql.Driver");
		 //give url ,username and pass
		 con= DriverManager.getConnection("jdbc:postgresql:bharatpg","postgres","cluster");
		 
		 return con;
	 }//getConnection method

	public int  register(String user,String pass) throws SQLException, ClassNotFoundException{
	
		String query="INSERT INTO LOGIN VALUES(?,?)";
		int count=0;
		  PreparedStatement ps=null;
			con=getConnection();
		    if(con!=null)
		    ps=con.prepareStatement(query);
		     ps.setString(1, user);
		     ps.setString(2, pass);
		     count=ps.executeUpdate();
		System.out.println(count);
		return count;
	}//insert method
	
	public List select() throws ClassNotFoundException, SQLException{
		String selectQuery="SELECT * FROM LOGIN";
		con=getConnection();
		List list=null;
		//create array list obj
		list=new ArrayList();
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 if(con!=null)
			 ps=con.prepareStatement(selectQuery);
		rs= ps.executeQuery();
		   System.out.println(rs);
		 while(rs.next()){
			 LoginBeans l=new LoginBeans();
		  l.setUser(rs.getString(1));
		  l.setPass(rs.getString(2));
		  list.add(l);
		 }//while
		 System.out.println(list);
		return list;
	}//select method
	
	public int delete(String user) throws ClassNotFoundException, SQLException{
		int count=0;
		String deleteQuery="DELETE  FROM LOGIN WHERE USERNAME=?";
		con=getConnection();
		 PreparedStatement ps=null;
		 ps=con.prepareStatement(deleteQuery);
	     ps.setString(1, user);
	     count=ps.executeUpdate();
	     return count;
		}
	
	public int update(String oldval,String newval) throws ClassNotFoundException, SQLException{
		int count=0;
		String updateQuery="UPDATE LOGIN SET USERNAME = ? "+ " WHERE USERNAME = ?";
		con=getConnection();
		 PreparedStatement ps=null;
		 ps=con.prepareStatement(updateQuery);
	     ps.setString(1, newval);
	     ps.setString(2, oldval);
	     count=ps.executeUpdate();
	     return count;
		}
}
