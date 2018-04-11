<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">

<form:form action="login" method="post" modelAttribute="log">
<table>
<tr>
<th>NAME :</th>
<td><form:input path="nme"/></td>
<td><form:errors cssClass="error"/>
</td>
</tr>

<tr>
<th>password :</th>
<td><form:input path="pwd"/></td>
<td><form:errors cssClass="error"/>
</td>
</tr>

  <tr>
        <td><button type="submit">Submit</button></td>
      </tr>

</table>

</</form:form>





</body>
</html>