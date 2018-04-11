<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@ page errorPage="errorpage.jsp" import="javax.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%!
Connection con;
%>

<%!public void jspInit()
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver is loaded");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SACHINORACLE","SACHINORACLE");
System.out.println("got connection");


}
catch(Exception e)
{
	
}
}
%>

<%!
public void jspDestroy()
{
	try{
		con.close();	
	}
	catch(Exception e)
	{
		
	}
}

%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
try{
	
	String strNme=request.getParameter("nme");
	String strPwd=request.getParameter("pwd");
	int strPh=Integer.parseInt(request.getParameter("ph"));
	
	System.out.println(strNme);
	
	PreparedStatement pst=null;
	
	try{
		
	pst=con.prepareStatement("INSERT INTO CUST(NAME,PASSWORD,PHONE)VALUES(?,?,?)");
	pst.setString(1,strNme);
	pst.setString(2,strPwd);
	pst.setInt(3,strPh);
	int i=pst.executeUpdate();

	if(i==1)
	{
		System.out.println("succes");
		%>
		<h1>success</h1>
		<% 
		
		
	}

}
catch(Exception e)
{
	System.out.println(e);
}
	finally{
		
		try{
			pst.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

%>
</body>
</html>