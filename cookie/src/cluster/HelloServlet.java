package cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
     res.setContentType("text/html");
     PrintWriter pw = res.getWriter();
     String strfname = req.getParameter("fname");
     String strlname = req.getParameter("lname");
     
     Cookie c1 = new Cookie("FName",strfname);
     Cookie c2 = new Cookie("LName",strlname);
     
     res.addCookie(c1);
     res.addCookie(c2);
     
     pw.println("<html>");
     pw.println("<body bgcolor='yellow'>");
     pw.println("<form action='./jsp/withEL.jsp'");
     pw.println("<center><h2>PROFESSIONAL DETAILS</CENTER>");
     pw.println("<table>");
     pw.println("<tr><td>ENTER YOUR CURRENT COMPANY NAME</td>");
     pw.println("<td><input type='text' name='compname'></td>");
     pw.println("</tr><tr><td>Enter your curent Salary</td>");
     pw.println("<td><input type='text' name='salary'></td>");
     pw.println("</tr><tr><td colspan='2' align='center'><input type='submit' value='submit'></td>");
     pw.println("</form>");
	}
}