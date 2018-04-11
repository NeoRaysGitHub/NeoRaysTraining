<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cluster.pojo.PersonTo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<jsp:useBean id="pto" class="com.cluster.pojo.PersonTo" scope="request">

</jsp:useBean>

name=<jsp:getProperty property="name" name="pto"/>
password=<jsp:getProperty property="password" name="pto"/><br>
phone=<jsp:getProperty property="phone" name="pto"/><br>
email=<jsp:getProperty property="email" name="pto"/><br>
</body>
</html>