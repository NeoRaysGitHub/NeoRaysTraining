<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
 		<%
 			application.setAttribute("driver_name",request.getParameter("driver_name"));
 			application.setAttribute("url", request.getParameter("url"));
 			application.setAttribute("username", request.getParameter("username"));
 			application.setAttribute("password", request.getParameter("password"));
 		
 		%>
		Driver Name : ${applicationScope.driver_name}<br>
		Url : ${applicationScope.url} <br>
		User Name : ${applicationScope.username} <br>
		Password : ${applicationScope.password} <br>
</body>
</html>