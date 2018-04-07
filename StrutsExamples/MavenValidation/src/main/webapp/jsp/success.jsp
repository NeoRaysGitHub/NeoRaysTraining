<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="#FFFF00">
		<h1>Name: <%= request.getAttribute("a") %></h1>
		<h1>Email: <%= request.getAttribute("b") %></h1>
		<h1>Phone: <%= request.getAttribute("c") %></h1>
		<h1>for student with sid=<bean:write name="loginForm" property="sid"/></h1>
	</body>
</html:html>