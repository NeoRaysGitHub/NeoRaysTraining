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
		
		ServletContext ctx = getServletContext();
		HttpSession ses = req.getSession();

	    //req.setAttribute("NAME",fname);
		ses.setAttribute("NAME",lname);
		ctx.setAttribute("NAME",ph);
		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req,res);
	}
}