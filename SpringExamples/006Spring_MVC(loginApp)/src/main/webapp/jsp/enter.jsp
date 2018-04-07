<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body bgcolor="wheat">
<form:form action="check"  commandName="uto">
<table>
<tr>
<td>enter your name</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>enter your password</td>
<td><form:password path="password"/></td>
</tr>
<tr>
<td><input type="submit" value="SIGN IN"/>
</td>
</tr>
</table>
</form:form>
</body>
</html>