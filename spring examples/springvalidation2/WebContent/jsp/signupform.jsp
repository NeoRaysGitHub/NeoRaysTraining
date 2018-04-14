<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body bgcolor="wheat">
<h2>Customer Signup Form @valid example</h2>
<form:form commandName="customer" action="signup">
<table>
<tr><td>Customer Name:</td>
<td><form:input path="name" /></td>
<td><form:errors path="name" /></td>
</tr>
<tr><td>Customer Age:</td><
<td><form:input path="age"/></td>
<td><form:errors path="age" /></td>
</tr>
<tr>
<td colspan="3"><input type="submit" value="submit"/></td>
</tr>
</table>
</form:form>
</body>
</html>