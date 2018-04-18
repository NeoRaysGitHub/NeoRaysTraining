package com.bharath;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String strFname = req.getParameter("fname");
		String strLname = req.getParameter("lname");
		String strPh = req.getParameter("ph");
		
		ServletContext ctx = getServletContext();
		HttpSession ses = req.getSession();
		
		//req.setAttribute("NAME", strFname);
		ses.setAttribute("NAME", strLname);
		ctx.setAttribute("NAME", strPh);
		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req, res);
		
	}

}
