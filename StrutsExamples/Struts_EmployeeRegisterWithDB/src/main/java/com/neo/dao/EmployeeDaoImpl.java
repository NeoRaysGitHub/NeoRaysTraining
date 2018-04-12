package com.neo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neo.form.RegisterForm;
import com.neo.util.DbConnection;

public class EmployeeDaoImpl implements EmployeeDao{
	static final String SQL_INSERT_EMPLOYEE = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)"; 
	public int saveEmployee(RegisterForm form) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		// get the connection
		con = DbConnection.getConnection();
		// create preparestatement
		ps = con .prepareStatement(SQL_INSERT_EMPLOYEE);
		if(ps!=null){
			// set the query param values to the query
			ps.setInt(1, form.getEmployee_id());
			ps.setString(2, form.getEmployee_name());
			ps.setString(3, form.getJob());
			ps.setDouble(4, form.getSalary());
			ps.setString(5, form.getPhone());
			// execute the query			
		}
		return ps.executeUpdate();
	}
	public List<RegisterForm> getEmployees() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		RegisterForm form = new RegisterForm();
		List<RegisterForm> list = new ArrayList<RegisterForm>();
		// get the connection 
		con = DbConnection.getConnection();
		ps = con.prepareStatement("SELECT * FROM EMPLOYEE");
		// execute the query
		rs = ps.executeQuery();
		if(rs!=null){
			if(rs.next()){
				form.setEmployee_id(rs.getInt(1));
				form.setEmployee_name(rs.getString(2));
				form.setJob(rs.getString(3));
				form.setSalary(rs.getDouble(4));
				form.setPhone(rs.getString(5));
				list.add(form);				
			}
		}		
		return list;
	}

}
