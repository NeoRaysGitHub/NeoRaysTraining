package com.neorays;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("inside servlet");
		
		RequestDispatcher rd=req.getRequestDispatcher("./jsp/home.jsp");
		rd.forward(req, res);
		
	}
	
}
