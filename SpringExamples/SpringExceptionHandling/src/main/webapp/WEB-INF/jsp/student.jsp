<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addStudent" commandName="student" method="POST">
 <table align="center" border="0.1">
  <tr> <td><spring:message code="lable.id"/></td> <td> <form:input path="id"/> </td> </tr>
  <tr> <td><spring:message code="lable.name"/></td> <td> <form:input path="name"/> </td> </tr>
  <tr> <td><spring:message code="lable.age"/></td> <td> <form:input path="age"/> </td> </tr>
  <tr> <td colspan="2" align="center"> <input type="submit" value="Submit"> </td></tr>
 </table>

</form:form>
</body>
</html>