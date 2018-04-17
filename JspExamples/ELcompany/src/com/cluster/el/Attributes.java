package com.cluster.el;

import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

public class Attributes extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String strFname = req.getParameter("nm");
		String strPh = req.getParameter("ph");
	
		ServletContext ctx = getServletContext();
		HttpSession ses = req.getSession();
		req.setAttribute("FNAME", strFname);
		ctx.setAttribute("PH", strPh);
		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/usingEL.jsp");
		rd.forward(req, res);
	
	
}
}
