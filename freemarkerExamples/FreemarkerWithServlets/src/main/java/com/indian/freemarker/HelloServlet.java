package com.indian.freemarker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 private static List<User> userList=new ArrayList<User>();
 
 static{
	 
	 userList.add(new User("Bill","Gates"));
	 userList.add(new User("bharath","chennuru"));
	 userList.add(new User("suni","nandharapu"));
	 userList.add(new User("bharagavi","kalepalli"));
	 userList.add(new User("Bill","Gates"));
 }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("users",userList);
		request.getRequestDispatcher("/index.ftl").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		
		if(null != firstname && null != lastname
				&& !firstname.isEmpty() && !lastname.isEmpty()) {
			
			synchronized (userList) {
				userList.add(new User(firstname, lastname));
			}
			
		}
		
		doGet(request, response);
		
	}

}
