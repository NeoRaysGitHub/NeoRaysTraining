package com.cluster.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cluster.beans.LoginBeans;
import com.cluster.util.LoginConnection;

@Repository
public class LoginDAO {
	static Connection con = null;

	public int insert(LoginBeans bean) throws Exception {
		String query = "insert into logins values(?,?)";
		int count = 0;
		PreparedStatement ps = null;
		con = LoginConnection.getConnection();
		System.out.println("got connection");
		System.out.println(con);
		if (con != null)
			ps = con.prepareStatement(query);
		ps.setString(1, bean.getUser());
		ps.setString(2, bean.getPass());
		count = ps.executeUpdate();
		System.out.println(count);
		return count;
	}

	public List selectAll() throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = null;
		String select_query = "SELECT * FROM LOGINS ";
		con = LoginConnection.getConnection();
		ps = con.prepareStatement(select_query);
		System.out.println(con);
		rs = ps.executeQuery();
		System.out.println(rs);
		System.out.println(list);
		list=new ArrayList();
		while (rs.next()) {
			LoginBeans l = new LoginBeans();
			l.setUser(rs.getString(1));
			l.setPass(rs.getString(2));
			list.add(l);
		}
		System.out.println(list);
		return list;
	}

	public List select(String user) throws Exception {
		System.out.println(user);

		PreparedStatement ps = null;
		ResultSet rs = null;
		con = LoginConnection.getConnection();
	    System.out.println(con);
		List list = null;
		String select_query = "SELECT * FROM LOGINS WHERE USERNAME=? ";
	
	
			list = new ArrayList();
			ps = con.prepareStatement(select_query);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {
				LoginBeans loginBeans = new LoginBeans();
				loginBeans.setUser(rs.getString(1));
				loginBeans.setPass(rs.getString(2));
		        list.add(loginBeans);
			}
		
		return list;
	}
}
