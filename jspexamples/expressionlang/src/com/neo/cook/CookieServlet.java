package com.neo.cook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CookieServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String strFname = req.getParameter("fn");
		String strLname = req.getParameter("ln");
		
		
		Cookie c1 = new Cookie("FNAME",strFname);
		Cookie c2 = new Cookie("LNAME",strLname);
		
		res.addCookie(c1);
		res.addCookie(c2);
		
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<form action='Cookie.jsp'>");
		pw.println("<center><h2>PROFFESIONAL DETAILS</center>");
		pw.println("<table>");
		pw.println("<tr><td>Enter your current company name</td>");
		pw.println("<td><input type='text' name='compname'></td></tr>");
		pw.println("<tr><td>Enter your current salary</td>");
		pw.println("<td><input type='text' name='sal'></td></tr>");
		pw.println("<tr><td><input type='submit' value='Submit'></td></tr>");
		pw.println("</form></body></html>");
		//RequestDispatcher rd=req.getRequestDispatcher("Cookie.jsp");
		//rd.forward(req, res);
	}
}

