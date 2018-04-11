package com.cluster.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.cluster.form.LoginForm;
import com.cluster.to.LoginTo;
import com.cluster.util.DBUtil;

public class LoginDao{
	
	Connection conn;
	public LoginDao()throws ClassNotFoundException, SQLException{
		
		conn = DBUtil.getpostgresconnection();
	}
	public LoginTo checklogin(LoginForm loginform) {
		System.out.println("inside DAO");
		int strid = Integer.parseInt(loginform.getEmpid());
	    String strpwd = loginform.getPassword();
	    //String query="Select * from employee where id="+strid+" and password="+strpwd+"";
	    boolean isvalid=false;
	    LoginTo loginto=null;
	    try{
	    	
        PreparedStatement statement = conn.prepareStatement("Select * from employee e INNER JOIN employee_details ed on e.id=ed.emp_id where e.id=? and e.password=?");
        statement.setInt(1,strid);
        statement.setString(2,strpwd);
         ResultSet resultset = statement.executeQuery();
          
	  while(resultset.next()){
	  loginto=new LoginTo();
		 loginto.setEmp_id(resultset.getInt("emp_id"));
		  loginto.setName(resultset.getString("name"));
		  loginto.setAddress(resultset.getString("address"));
		  loginto.setPhone(resultset.getString("phone"));
		  loginto.setEmail(resultset.getString("email"));
		  System.out.println("loginTo filled");
		 
		 
		
	    }
	    }catch(Exception e){
	    	System.out.println(e);
	    }
	   return loginto;
	
}
}