<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h2>Login Page</h2>
<html:html>
	<html:form action="/register">
	Enter your FirstName:
	<html:text property="firstName" size="50"/><br>
	Enter your LastName:
	<html:text property="lastName" size="50"/><br>
	Enter your UserName:
	<html:text property="userName" size="50"/><br>
	Enter your Password:
	<html:text property="password" size="50"/><br>
	Enter your Email:
	<html:text property="email" size="40"/><br>
	Enter your Phone No:
	<html:text property="phone" size="10"/><br>
		<html:submit>submit</html:submit>
	
	</html:form>
</html:html>
</body>
</html>