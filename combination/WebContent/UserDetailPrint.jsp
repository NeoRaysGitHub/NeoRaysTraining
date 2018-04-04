<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.neo.To.PersonTo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="wheat">
<center>
<h1>Hello Welcome User</h1>
</center>
<br>
<p>Following are your details</p>
<%
	PersonTo person = (PersonTo)request.getAttribute("pto");
%>
<font size="5" color="red">
Your name is <%=person.getName()%><br>
Your password is <%=person.getPassword()%><br>
Your phone is <%=person.getPhone()%><br>
Your email is <%=person.getEmail()%><br>
</font>
</body>

</html>