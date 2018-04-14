<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html><head>
<style type="text/css">
.errors{
color: red
 }
</style>
</head>
<body bgcolor="pink">
<form:form action="display" commandName="user">
<table>
<tr><td>Enter your First Name</td>
<td><form:input path="fname"/></td>
<td><form:errors path="fname" cssClass="errors"/></td></tr>
<tr><td>Enter Your Last Name</td>
<td><form:input path="lname"/></td>
<td><form:errors path="lname" cssClass="errors"/></td></tr>
<tr><td><input type="submit" value="submit"/></td></tr>
</table>
</form:form>
</body>
</html>