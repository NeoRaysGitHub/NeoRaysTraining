<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<h2>without EL  and using jhava code</h2>
<%
String strFname=request.getParameter("fname");
String strLname=request.getParameter("lname");
String arrPh[]=request.getParameterValues("ph");

%>

<h1>First Name:<%=strFname %></h1><br>
<h1>last name:<%=strLname %></h1><br>
<br>
<h1>phone 1:<%=arrPh[0] %></h1>
<br>

<h1>phone 2:<%=arrPh[1] %></h1><br>
</body>
</html>