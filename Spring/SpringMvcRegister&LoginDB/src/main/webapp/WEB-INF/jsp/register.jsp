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
<title>Register</title>
</head>
<body>
	<h1 align="center">
		<spring:message code="header.register" />
	</h1>
	<hr>
	<form:form action="register" commandName="user" method="POST">
		<div>
			<table align="center" border="0">
				<tr>
					<td><spring:message code="label.id" /></td>
					<td><form:input path="user_id" /></td>
					<td><form:errors path="user_id" cssClass="error"/></td>
				</tr>
				<tr>
					<td><spring:message code="label.username" /></td>
					<td><form:input path="username" /></td>
					<td><form:errors path="username" cssClass="error"/></td>
				</tr>
				<tr>
					<td><spring:message code="label.password" /></td>
					<td><form:input path="password" /></td>
					<td><form:errors path="password" cssClass="error"/></td>
				</tr>
				<tr>
					<td><spring:message code="label.role" /></td>
					<td><form:input path="role" /></td>
					<td><form:errors path="role" cssClass="error"/></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Register"></td>
				</tr>

			</table>
		</div>



	</form:form>
</body>
</html>