<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <% String first_name = "Suresh";
	 	String last_name = "Reddy";
	 	String full_name = first_name + last_name;
	 	Date date = new Date();
	 	%>
	 <%! 
	   public String sayHello(String name){
		 return "Hello !" + name;
	 }
	 %>
	 First Name = <%=first_name %> <br>
	 Last Name = <%= last_name %>  <br>
	 Full Name = <%= full_name %>  <br>
	 System Date = <%= date %> <br>
	 
	 <%=sayHello(full_name) %>
	</body>
</html>