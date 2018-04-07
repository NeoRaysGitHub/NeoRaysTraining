<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="purple">
<h1>without EL </h1>
<% 
String strFname=request.getParameter("fname");
String strLname=request.getParameter("lname");
String strPh=request.getParameter("ph");
String arrPh[] =request.getParameterValues("ph");
%>
first name: <%= strFname %><br>
last name: <%= strLname %><br>
primary phone: <%= strPh %><br>
primary phone: <%= arrPh[0] %><br>
secondary phone: <%= arrPh[1]%><br>
</body>
</html>