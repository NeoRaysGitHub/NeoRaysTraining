<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%	
	String a = (String)request.getAttribute("NAME");
	String b = (String)session.getAttribute("NAME");
	String c = (String)application.getAttribute("NAME");
%>

	First Name 	:<%= a %><br> 
	Last Name	:<%= b %><br>
	Phone		:<%= c %><br>
	
</body>
