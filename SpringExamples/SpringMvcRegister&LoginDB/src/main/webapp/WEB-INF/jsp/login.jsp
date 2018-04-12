<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.error {
color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<h1 align="center">
		<spring:message code="header.login" />
	</h1>
	<hr>
	<h3 align="center">${msg}</h3>
	<form:form action="login" commandName="login">
		<table align="center" border="1">
			<tr>
				<td><spring:message code="label.username" /></td>
				<td><form:input path="username" /></td>
			</tr>
			<form:errors path="username" cssClass ="error"/>
			<tr>
				<td><spring:message code="label.password" /></td>
				<td><form:input path="password" /></td>
			</tr>
			<form:errors path="password" cssClass ="error"/>
			<tr>
				<td align="center" colspan="2"><input type="submit"
					value="Login"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>