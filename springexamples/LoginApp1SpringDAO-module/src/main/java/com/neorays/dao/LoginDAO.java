package com.neorays.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.neorays.beans.LoginBeans;

@Repository
public class LoginDAO {
	@Autowired
	  private JdbcTemplate jt;
// private 	static final String INSERT_query="INSERT INTO LOGIN VALUES(?,?)";
 private 	static final String DELETE_QUERY=
		 "DELETE FROM LOGIN WHERE USERNAME=? AND passwaord=?";
 private 	static final String SELECT_QUERY=
		 "SELECT * FROM LOGIN";
 private 	static final String SELECT_QUERY_ONE= "SELECT * FROM LOGIN ";
		
	public int  register(String user,String pass) throws SQLException, ClassNotFoundException{
	    int count =0;   
		//use jdbcTemplate
	   // jt.q
		count=jt.update(DELETE_QUERY, user,pass);
		System.out.println("result ="+count);
	  return  count;	
	}//insert method
	
	public List select() throws ClassNotFoundException, SQLException{
		 System.out.println("dao select method");
		//use jdbcTemplate
		List list= jt.queryForList(SELECT_QUERY);
		System.out.println("list data "+list);
		return list;
	}//select method
	
	public List selectOne(){
		 System.out.println("dao select one data method");
		 String ss="PRASAD";
		//use jdbcTemplate
		 List<LoginBeans> list=jt.query(SELECT_QUERY_ONE, new InnerLogin());
		 //List<LoginBeans> list= jt.queryForObject(SELECT_QUERY_ONE, new InnerLogin());
		System.out.println("list data "+list);
		return list;
	}//select method
	
	/*class InnerLogin implements RowMapper{
		
		public List<LoginBeans> mapRow(ResultSet rs, int arg) throws SQLException {
			List<LoginBeans> list=new ArrayList<LoginBeans>();
			LoginBeans b=new LoginBeans();
			b.setName(rs.getString(1));
			b.setPassword(rs.getString(2));
			list.add(b);
			return  list;
		}//mapRow mehod
*/		
	class InnerLogin implements ResultSetExtractor{

		public List<LoginBeans> extractData(ResultSet rs) throws SQLException,
				DataAccessException {
			List<LoginBeans> list=new ArrayList<LoginBeans>();
			while (rs.next()) {
				LoginBeans b=new LoginBeans();
				b.setName(rs.getString(1));
				b.setPassword(rs.getString(2));
				list.add(b);
			}
			
			return list;
		}
		
	}//class
	
	
}
