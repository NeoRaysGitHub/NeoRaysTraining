<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%	
	String a = (String)request.getAttribute("FNAME");
	String b = (String)application.getAttribute("PH");
%>

	First Name 	:<%= a %><br> 
	Phone		:<%= b %><br>
	
</body>
</html>