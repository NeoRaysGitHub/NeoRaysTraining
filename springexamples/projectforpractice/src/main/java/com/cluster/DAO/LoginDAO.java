package com.cluster.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cluster.util.LoginConnection;
@Repository
public class LoginDAO {
    static Connection cn=null;
    PreparedStatement ps=null;
	
	public int insert(String user,String pass,String mail){
		System.out.println(user+"  "+pass+"  "+mail);
		int count=0;
		cn=LoginConnection.getConnection();
		String insert_query="insert into detail values(?,?,?)";
		try {
			ps=cn.prepareStatement(insert_query);
			ps.setString(1, user);
			ps.setString(2, pass);
			ps.setString(3, mail);
			count=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
}
