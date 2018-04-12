<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1 align="center">User Registration</h1>
	<hr>
	<br>
	<html:form action="/userRegister">
		<table align="center" border="1">
			<tr>
				<td><bean:message key="username" />:</td>
				<td><html:text property="username"></html:text></td><html:errors property="username"/>
			</tr>
			<tr>
				<td><bean:message key="password" />:</td>
				<td><html:text property="password"></html:text></td><html:errors property="password"/>
			</tr>
			<tr>
				<td><bean:message key="conform_password" />:</td>
				<td><html:text property="conform_password"></html:text></td><html:errors property="conform_password"/>
			</tr>
			<tr>
				<td><bean:message key="email_id" />:</td>
				<td><html:text property="email_id"></html:text></td><html:errors property="email_id"/>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit>
						<bean:message key="save" />
					</html:submit>
		</table>
		
		<div align="center">
			<html:link action="/user.do?link=index">
				<bean:message key="home" />
			</html:link>
		</div>

	</html:form>
</body>
</html>