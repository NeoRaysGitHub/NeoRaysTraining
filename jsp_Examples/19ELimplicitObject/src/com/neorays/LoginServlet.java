package com.neorays;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String strFnme=req.getParameter("fnme");
		String strLnme=req.getParameter("lnme");
		String strPh1=req.getParameter("ph1");
		String strPh2=req.getParameter("ph2");
		
		ServletContext ctx=getServletContext();
		HttpSession ses=req.getSession();
		
		req.setAttribute("fn", strFnme);
		ctx.setAttribute("ln", strLnme);
		ses.setAttribute("ph1", strPh1);
		Cookie ck=new Cookie("ph2", strPh2);
		res.addCookie(ck);
		System.out.println("................");
		
		RequestDispatcher rd=req.getRequestDispatcher("./jsp/display.jsp");
		rd.forward(req, res);
		
	}
	

}
