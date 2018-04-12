<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
			<table align="center" border="1">
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Job</th>
					<th>Salary</th>
					<th>Dept No</th>
				</tr>
				<tr>
					<td>${employee.getEmpno()}</td>
					<td>${employee.getEname()}</td>
					<td>${employee.getJob()}</td>
					<td>${employee.getSal()}</td>
					<td>${employee.getDeptno()}</td>
				</tr>
			</table>
		</div>
</body>
</html>