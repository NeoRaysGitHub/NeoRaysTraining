<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h2 align="center">TO T E S T</h2>
	<form:form action="register" commandName="register" method="post">
		<table align="center" border="1">
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
