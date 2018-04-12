package com.cluster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cluster.form.StudentForm;
import com.cluster.util.DBConnection;

public class StudentDao {
	static final String SQL_INSERT = "INSERT INTO STUDENT VALUES(?,?,?,?)";
	public int saveStudent(StudentForm std) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		// get the connection
		con = DBConnection.getConnection();
		if(con!=null){
			// prepare sql statement
			ps = con.prepareStatement(SQL_INSERT);
			if(ps!=null){
				// set the query param values to the sql
				ps.setInt(1, std.getId());
				ps.setString(2, std.getName());
				ps.setString(3, std.getAddress());
				ps.setString(4, std.getPhone());
				// execute the query
				count = ps.executeUpdate();
			}
		}
		return count;
	}

}
