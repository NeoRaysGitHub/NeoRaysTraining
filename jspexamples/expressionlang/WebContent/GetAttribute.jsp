<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Without EL and using java code</h1>
<%	
	String a = (String)request.getAttribute("FNAME");
	String b = (String)session.getAttribute("LNAME");
	String c = (String)application.getAttribute("PH");
%>

	First Name 	:<%= a %><br> 
	Last Name	:<%= b %><br>
	Phone		:<%= c %><br>
	
</body>
</html>