<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body bgcolor="pink">
<form:form action="check" commandName="uto">
<br>
enter your name:
<form:input path="username"/><br>
enter your password:
<form:password  path="password"/><br>
<br>
<input type="submit" value="login"/>

</form:form>

</body>
</html>