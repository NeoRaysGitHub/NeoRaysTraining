<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1><br>
<%
	String strCountry = application.getInitParameter("country");
%>
 Country Name <%= strCountry%>
</body>
</html>