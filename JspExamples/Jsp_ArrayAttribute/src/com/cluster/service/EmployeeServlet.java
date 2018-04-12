package com.cluster.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cluster.bean.EmployeeBean;

/**
 * Servlet implementation class EmployeeBean
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*//get the params 
		int employee_id = Integer.parseInt(request.getParameter("employee_id"));
		String name = request.getParameter("name");
		EmployeeBean emp = new  EmployeeBean();
		emp.setEmployee_id(employee_id);
		emp.setName(name);*/
		String employee_names[] = {"Suresh","Reddy","Poorna","Venky"};
		System.out.println(employee_names[0]);
		request.setAttribute("emp_names", employee_names);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/employeeArray.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
