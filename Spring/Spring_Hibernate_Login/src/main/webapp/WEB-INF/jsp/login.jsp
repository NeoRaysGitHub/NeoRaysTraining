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
background-color: silver;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<div align="center" style="background-color: gray;">
		<h1>
			<spring:message code="header.login" />
		</h1>
	</div>
	<div
		style="background-image: url('C:\Users\Public\Pictures\Sample Pictures\Chrysanthemum.jpg');">
		<form:form action="login" commandName="login" method="POST">
			<div>
				<table align="center" style="background-color: olive;">
					<tr>
						<td><spring:message code="lable.email_id" /></td>
						<td><form:input path="email_id" /></td>
						<td><form:errors path="email_id" cssClass="error" /></td>
					</tr>
					<tr>
						<td><spring:message code="lable.password" /></td>
						<td><form:input path="password" /></td>
						<td><form:errors path="password" cssClass="error" /></td>
					</tr>
					<tr>
						<td align="center" colspan="2"><input type="submit" value="Login"></td>
					</tr>
				</table>
			</div>
		</form:form>

	</div>

</body>
</html>