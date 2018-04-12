<%@page import="com.cluster.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Login Success </h1> 
<%--  <%
  	User user = (User)request.getAttribute("user");	
 %>
 User Name  : <%=user.getUsername()%> <br>
 Email : <%=user.getEmail() %><br>
 Address : <%=user.getAddress()%>
 
 --%> 
 <jsp:useBean id="user"  class="com.cluster.pojo.User" scope="request">
 </jsp:useBean>
 User Name : <jsp:getProperty property="username" name="user"/><br>
 Email : <jsp:getProperty property="email" name="user"/><br>
 Address : <jsp:getProperty property="address" name="user"/>
</body>
</html>