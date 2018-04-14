<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body bgcolor="pink">
<form:form action="display" commandName="user">
<table border="1">
<tr><td>Enter your First Name</td>
<td><form:input path="fname"/></td>
<td><form:errors path="fname"/></td>

</tr>
<tr>
<td>Enter your Last Name</td>
<td><form:input path="lname"/></td>
<td><form:errors path="lname"/></td>

</tr>
<tr><td><input type="submit" value="submit"/></td></tr>

</table>
</form:form>
</body>
</html>