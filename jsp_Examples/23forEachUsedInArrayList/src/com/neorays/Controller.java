package com.neorays;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("inside servlet");
		
		ArrayList al=new ArrayList();
		
		al.add("sachin");
		al.add("ccc");
		al.add("bbb");
		al.add("aaa");
		
		HttpSession session=req.getSession();
		session.setAttribute("alo", al);
		
		RequestDispatcher rd=req.getRequestDispatcher("./jsp/home.jsp");
		rd.forward(req, res);
		
	}
	
}