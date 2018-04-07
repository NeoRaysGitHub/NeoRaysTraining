<%@ page import="java.sql.*" errorPage="DBerror.jsp"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%! Connection con; %>
    <%!public void jspInit() {
    	System.out.print("#################Inside jspInit()");
    	try{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		System.out.println("driver is loaded");
    		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ashwinioracle","ashwinioracle");
    		System.out.println("got connection ");
    	}
    	catch(ClassNotFoundException cnfe)
    	{
    		System.out.println(cnfe);
    	}
    	catch(SQLException sqle)
    	{
    	System.out.println(sqle);
    	}
    	}%>
    	<%! public void jspDestroy()
    	{
    		System.out.println("############inside jspDestroy()");
    		try
    		{
    			con.close();
    		}
    		catch(SQLException sqle)
    		{
    			System.out.println(sqle);
    		}
    		}
    		%>
    	
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
String strName=request.getParameter("name");
String strPwd=request.getParameter("pwd");
String strPhone=request.getParameter("phone");
String strEmail=request.getParameter("email");
System.out.println(strName);

PreparedStatement pst=null;
try{
	pst=con.prepareStatement("INSERT INTO CUSTOMER(NAME,PASSWORD,EMAIL,PHONE)VALUES(?,?,?,?)");
	pst.setString(1,strName);
	pst.setString(2,strPwd);
	pst.setString(3,strPhone);
	pst.setString(4,strEmail);
	int i= pst.executeUpdate();
	if(i==1)
	{
	%>
	Hello <%=strName %> Thank you for becoming a member
	<%
	} else {
	%>
	hello
	
	<%=strName %>
	better luck next time
	<%
	}
	}
	catch(SQLException sqle)
	{
	sqle.printStackTrace();
	}
	finally
	{
	try
	{
	pst.close();
	}
	catch(SQLException e)
	{
	e.printStackTrace();
	}
	}
%>
</body>
</html>