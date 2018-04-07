package com.cluster;
import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class MyServlet extends HttpServlet
{
	
	
	
  @Override
public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
  {
	  System.out.println("inside servlet......");
	  String name=req.getParameter("nm");
	  String pswd=req.getParameter("pwd");
	 System.out.println("values fetched....");
	  RequestDispatcher rd=null;
	  System.out.println("verifying....");
	  if(name.equalsIgnoreCase("deepa") && pswd.equalsIgnoreCase("shree"))
	  {
		  PrintWriter out=resp.getWriter();
		  out.println("<html><body><h1>"+name+"</h1></body></html>");
		  System.out.println("verfied user.....");
		  rd=req.getRequestDispatcher("success.jsp");
		  rd.forward(req, resp);
	  }
	  
	  else
	  {
		  System.out.println("invalid user....");
		  rd=req.getRequestDispatcher("failure.jsp");
		  rd.forward(req, resp);
	  }
  }
  
 
	
}
