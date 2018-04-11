package com.neorays;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.neorays.to.DepartmentTo;
import com.neorays.to.StudentTo;

public class ControllerServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String strId=req.getParameter("id");
		int id=Integer.parseInt(strId);
		
		DepartmentTo d=new DepartmentTo();
		d.setDname("Development");
		d.setCity("b.lr");
		
		StudentTo st=new StudentTo();
		st.setId(id);
		st.setName("sachin");
		st.setDept(d);
		
		HttpSession ses=req.getSession();
		ses.setAttribute("sto", st);
		System.out.println("inside servlet");
		RequestDispatcher rd=req.getRequestDispatcher("./jsp/display.jsp");
		rd.forward(req, res);
		
		
		
		
			}

	
}
