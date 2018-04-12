<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="employee.do" method="POST" commandName="employee">
			<table align="center" border="" style="border: 1cm;">
				<tr>
					<td>Employee Number :</td>
					<td><form:input path="empno" /></td>
					<td><input type="submit" name="empno" value="Find"></td>
					<td>${msg}</td>
				</tr>
				<%-- <tr>
					<td>Employee Dept No :</td>
					<td><form:input path="deptno" /></td>
					<td><input type="submit" name="deptno" value="Find">
					<td>${msg}</td>
				</tr> --%>
				<tr>
					<td colspan="4" align="center"><a href="allemployees.do"> Get All Employees</a></td>
				</tr>
			</table>

			<br>
		</form:form>


	</div>
</body>
</html>