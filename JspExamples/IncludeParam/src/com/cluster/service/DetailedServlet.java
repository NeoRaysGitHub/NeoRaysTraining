package com.cluster.service;

import java.io.IOException;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cluster.dto.PersonDTO;
import com.cluster.util.DBUtil;
public class DetailedServlet extends HttpServlet{
	Connection con=null;
		
		@Override
		public void init() throws ServletException {
			try{
				System.out.println("connecting");
				con=DBUtil.getConnectToOracle();
				
			}catch(SQLException |ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		
			
			
		}
	
		public void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			
			System.out.println("inside doget");
			PreparedStatement pst=null;
			ResultSet rs=null;
			RequestDispatcher rd=null;
			
		
			int ffid=Integer.parseInt(req.getParameter("pid"));
			
			
			
			System.out.println(ffid);
			
			
			try {
				pst=con.prepareStatement("select id,fname,lname,salary from person where id=? ");
				System.out.println("...........");
				pst.setInt(1, ffid);
				System.out.println("...........");
				rs=pst.executeQuery();
				PersonDTO dto= new PersonDTO();
				while(rs.next())
				{
					int id=rs.getInt("ID");
					String fname=rs.getString("FNAME");
					String lname=rs.getString("LNAME");
					double salary=rs.getDouble("SALARY");
					dto.setFname(fname);
					dto.setLname(lname);
					dto.setId(id);
					dto.setSalary(salary);
					
					req.setAttribute("pto", dto);
					rd=req.getRequestDispatcher("./jsp/userdetail.jsp");
					rd.forward(req, resp);
					
				}
			} catch (SQLException e) {
				System.out.println("sql :"+e);
				
				
				
				
			}
		}
		

	}


