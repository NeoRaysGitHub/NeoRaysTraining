package com.cluster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cluster.pojo.User;
import com.cluster.util.DbConnection;

public class UserDao {
	static final String User_SQL = "SELECT USER_NAME,EMAIL,ADDRESS FROM USERS WHERE USER_NAME = ? AND PASSWORD = ?";
	public static User getUser(String username,String password) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		// get the connection obj
		con = DbConnection.getConnection();
		ps = con.prepareStatement(User_SQL);
		// set the values to the query param
		ps.setString(1, username);
		ps.setString(2, password);
		if(ps!=null){
			rs = ps.executeQuery();
			if(rs!=null){
				if(rs.next()){
					user = new User();
					// fetch values and set to the user obj
					user.setUsername(rs.getString(1));
					user.setEmail(rs.getString(2));
					user.setAddress(rs.getString(3));					
				}
			}
			else{
				user = null;
			}
		}
		return user;
		}

}
