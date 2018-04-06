package com.cluster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cluster.to.AddressTo;
import com.cluster.to.StudentTo;



public class HelloServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		AddressTo address = new AddressTo();
		address.setArea("rajajinagar");
		address.setCity("banaglore");
		address.setCountry("india");
		
		StudentTo student = new StudentTo();
		student.setId(id);
		student.setFname("dinesh");
		student.setLname("pranav");
		student.setAddress(address);
		
		HttpSession ses = req.getSession();
        ses.setAttribute("sto",student);		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req,res);
		
		
		
		
		
	}
	
}