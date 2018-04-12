<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Student Registeration</h1>
	<br>
	<hr>
	<!--  Get the req param values  -->
	<%!Connection con;
	PreparedStatement ps;
	
	public void jspInit() {
		ServletConfig sc = getServletConfig();
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String username = sc.getInitParameter("username");
		String password = sc.getInitParameter("password");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			ps = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}%>

	<%
		int std_no = Integer.parseInt(request.getParameter("std_no"));
		String std_name = request.getParameter("std_name");
		String std_add = request.getParameter("std_add");
		ps.setInt(1, std_no);
		ps.setString(2, std_name);
		ps.setString(3, std_add);
		//execute the query\
		int count = ps.executeUpdate();
		if (count > 0)
			out.println("<b> Registeration Success</b>");
		else
			out.println("<b> Registeration fail <b>");
	%>
	<%!public void jspDestory() {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}%>
</body>
</html>