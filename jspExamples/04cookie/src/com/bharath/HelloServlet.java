package com.bharath;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String strFname = req.getParameter("fname");
		String strLname = req.getParameter("lname");
		
		Cookie c1 = new Cookie("FNAME",strFname);
		Cookie c2 = new Cookie("LNAME",strLname);
		
		res.addCookie(c1);
		res.addCookie(c2);
		
		pw.println("<html>");
		pw.println("<body bgcolor='orange'>");
		pw.println("<form action='./jsp/withEL.jsp'");
		pw.println("<center><h2>PROFFESIONAL DETAILS</center>");
		pw.println("<table>");
		pw.println("<tr><td>Enter your current company name</td>");
		pw.println("<td><input type='text' name='compname'></td></tr>");
		pw.println("<tr><td>Enter your current salary</td>");
		pw.println("<td><input type='text' name='sal'></td></tr>");
		pw.println("<tr><td><input type='submit' value='Submit'></td></tr>");
		pw.println("</form></body></html>");
	}

}
