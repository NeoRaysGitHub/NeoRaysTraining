package com.neo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cluster.util.DBConnection;
import com.neo.form.UserForm;
import com.neo.form.UserRegisterForm;

public class UserDaoImpl implements UserDao{
	static final String SQL_LOGIN_USER = "SELECT USER_NAME FROM USERS WHERE EMAIL_ID = ? AND PASSWORD = ?";
	static final String SQL_SAVE_USER = "INSERT INTO USERS(USER_ID,USER_NAME,PASSWORD,EMAIL_ID) VALUES(?,?,?,?)";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public UserForm login(UserForm form) throws ClassNotFoundException, SQLException {
		UserForm userForm = null;
		// get the connection
		con = DBConnection.getConnection();
		// prepare the statement
		ps = con.prepareStatement(SQL_LOGIN_USER);
		if(ps!=null){
			// set the query params
			ps.setString(1, form.getEmail_id());
			ps.setString(2, form.getPassword());
			// execute the query
			rs = ps.executeQuery();
			if(rs!=null){
				if(rs.next()){
					userForm = new UserForm();
				userForm.setUsername(rs.getString(1));
				}
			}
		}
		return userForm;
	}
	public int registerUser(UserRegisterForm registerFrom) throws ClassNotFoundException, SQLException {
		int count = 0;
		// get the connection
		con = DBConnection.getConnection();
		// prepare statement
		ps = con.prepareStatement(SQL_SAVE_USER);
		if(ps!=null){
			String seq = "nextval('SQ_USERS')";
			// set the query param values
			ps.setString(1, seq);
			ps.setString(2, registerFrom.getUsername());
			ps.setString(3, registerFrom.getPassword());
			ps.setString(4, registerFrom.getEmail_id());
			// execute the query
			count = ps.executeUpdate();
		}
		return count;
	}
	
	

}
