package com.cluster.service;

import java.sql.SQLException;

import com.cluster.dao.LoginDao;
import com.cluster.form.LoginForm;
import com.cluster.to.LoginTo;

public class LoginService{
	
	LoginDao logindao;
	public  LoginService() throws ClassNotFoundException, SQLException{
		
		System.out.println("into loginservice constructor");
		logindao= new LoginDao();
	}
	
	public LoginTo login(LoginForm loginform){
		System.out.println("into service class");
		return logindao.checklogin(loginform);
	}
}