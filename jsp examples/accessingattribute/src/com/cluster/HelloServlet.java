package com.cluster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String ph = req.getParameter("ph");
		
		ServletContext cnt = getServletContext();
		HttpSession hs = req.getSession();
		
		req.setAttribute("FNAME",fname);
		hs.setAttribute("LNAME",lname);
		cnt.setAttribute("PH",ph);
		
		RequestDispatcher  rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req,res);
		
	}
}