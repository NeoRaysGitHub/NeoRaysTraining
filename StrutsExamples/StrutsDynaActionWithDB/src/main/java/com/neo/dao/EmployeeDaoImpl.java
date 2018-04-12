package com.neo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neo.form.EmployeeForm;
import com.neo.util.DbConnection;

public class EmployeeDaoImpl implements EmployeeDao{
	static final String SQL_INSERT_EMP = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
	static final String SQL_UPDATE_EMP = "UPDATE EMPLOYEE SET employee_name = ?,job = ?,sal = ?,phone = ? where employee_id = ?";
	static final String SQL_DELETE_EMP = "DELETE FROM EMPLOYEE WHERE employee_id = ?";
	Connection con = null;
	PreparedStatement ps = null;
	int count = 0;
	public int saveEmployee(EmployeeForm form) throws ClassNotFoundException, SQLException {
		// get the connection
		con = DbConnection.getConnection();
		if(con!=null){
			// prepare the statement
			ps = con.prepareStatement(SQL_INSERT_EMP);
			if(ps!=null){
				// set the query param values 
				ps.setInt(1, form.getEmployee_id());
				ps.setString(2, form.getEmployee_name());
				ps.setString(3, form.getJob());
				ps.setDouble(4, form.getSalary());
				ps.setString(5, form.getPhone());
				// execute the query
				count = ps.executeUpdate();			
			}
		}
		return count;
	}

	public int updateEmployee(EmployeeForm form) throws ClassNotFoundException, SQLException {
		// get the connection
		con = DbConnection.getConnection();
		// prepare the statement
		ps = con.prepareStatement(SQL_UPDATE_EMP);
		if(ps!=null){
			// set the query param values 
			ps.setInt(5, form.getEmployee_id());
			ps.setString(1, form.getEmployee_name());
			ps.setString(2, form.getJob());
			ps.setDouble(3, form.getSalary());
			ps.setString(4, form.getPhone());
			// execute the query
			count = ps.executeUpdate();			
		}
		return count;
	}

	public int deleteEmployee(int employee_id) throws ClassNotFoundException, SQLException {
		// get the connection
		con = DbConnection.getConnection();
		// prepare the statement
		ps = con.prepareStatement(SQL_DELETE_EMP);
		if(ps!=null){
			// set the query param value
			ps.setInt(1, employee_id);
			// execute query
			count = ps.executeUpdate();
		}		
		return count;
	}
	
}
