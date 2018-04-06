package com.cluster;
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

import com.cluster.pojo.PersonTo;
import com.cluster.util.DBUtil;

public class UserDetailsServlet extends HttpServlet {
	Connection con;
	
	public void init() throws ServletException{
		try{
			con=DBUtil.getOracleConnection();
			
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe);
		} catch(SQLException sqle){
			System.out.println(sqle);
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String strnme = req.getParameter("nme");
		String strpwd = req.getParameter("pwd");
		PersonTo personto = new PersonTo();
		try{
			ps = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE NAME=? AND PASSWORD=?");
			ps.setString(1,strnme);
			ps.setString(2, strpwd);
			rs = ps.executeQuery();
			if(rs.next()){
				String name=rs.getString("name");
				String password=rs.getString("password");
				String email=rs.getString("email");
				String phone=rs.getString("phone");
				
				personto.setName(name);
				personto.setPassword(password);
				personto.setEmail(email);
				personto.setPhone(phone);
				
				req.setAttribute("pto",personto);
				RequestDispatcher rd = req.getRequestDispatcher("./jsp/hello.jsp");
				rd.forward(req,res);
				
			}	
				
			} catch(SQLException sqle){
				System.out.println(sqle);
			}finally{
				try{
					
				if(rs!=null){
					rs.close();
				}
				if(ps!=null){
					ps.close();
				}
				}catch(SQLException e){
					e.printStackTrace();
				}
				}
			
		}
		
	}


