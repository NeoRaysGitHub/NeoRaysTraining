<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form:form action="employee.do" method="POST" commandName="employee">
			<table align="center">
				<tr>
					<td>Employee Id :</td>
					<td><form:input path="employee_id" /></td>
				</tr>
				<tr>
					<td>Employee Name :</td>
					<td><form:input path="employee_name" /></td>
				</tr>
				<tr>
					<td>Employee Job:</td>
					<td><form:input path="job" /></td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td><form:input path="sal" /></td>
				</tr>
				<tr>
					<td>Employee Phone :</td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>