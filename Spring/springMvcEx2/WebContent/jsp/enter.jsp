<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body bgcolor="cyan">
	<form:form action="check" commandName="uto">
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>