package com.cluster.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cluster.pojo.User;
import com.cluster.service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Controller Class..");
		// get the req param values 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// call the service method
		UserService userService = new UserService();
		try {
			User user = userService.getUser(username, password);
			// keep the user obj in req scoop
			request.setAttribute("user", user);
			if(user!=null){
				System.out.println("User is not null");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/fail.jsp");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
