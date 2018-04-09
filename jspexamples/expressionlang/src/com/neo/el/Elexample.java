package com.neo.el;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Elexample")
public class Elexample extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Elexample() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("fn");
		String s2=request.getParameter("ln");
		String s3=request.getParameter("ph");
		String s4[]=request.getParameterValues("ph");
		
		System.out.println("first name is "+s1);
		System.out.println("last name is "+s2);
		System.out.println("phone number1 is "+s3);
		System.out.println("phone number2 is "+s4[1]);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
