package com.cluster;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cluster.to.ChessDetails;
import com.cluster.util.Util;


@WebServlet("/details")
public class ChessDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	Connection con;    
	public void init() throws ServletException
	{
		try {
			con = Util.getConn();
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PreparedStatement pst = null;
		ResultSet rs = null;
		String strNme = request.getParameter("name");
		String strPwd = request.getParameter("pwd");
		
		try {
			pst = con.prepareStatement("SELECT NAME,PASSWORD,EMAIL,PHONE,RATING FROM CHESS_TABLE WHERE NAME = ? and PASSWORD = ?");
			pst.setString(1, strNme);
			pst.setString(2, strPwd);
			rs = pst.executeQuery();
			if (rs.next()) {
				String name = rs.getString("NAME");
				String pwd = rs.getString("PASSWORD");
				String email = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				String rating= rs.getString("RATING");
				ChessDetails details = new ChessDetails();
				details.setName(name);;
				details.setPassword(pwd);;
				details.setEmail(email);
				details.setPhone(phone);
				details.setRating(rating);

				request.setAttribute("pto", details);
				RequestDispatcher rd = request.getRequestDispatcher("./jsp/display.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException sqle) {
			System.out.println(sqle);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pst != null) {
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}	
	
}
			

	

