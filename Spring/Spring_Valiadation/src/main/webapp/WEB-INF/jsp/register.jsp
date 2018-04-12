<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
. error {
color: red;
}
</style>
</head>
<body>
<h1 align="center"> User Registration </h1>
	<form:form action="register" method="post" commandName="user">
		<table align="center" border="1">
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" />
			</tr>
			<tr>
				<td>Age :</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error" />
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" />
			</tr>
			<tr>
				<td>Phone :</td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="error"/>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>