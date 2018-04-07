<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="purple">
<form:form action="check" commandName="uto">
  <table>
  <tr>
  <td>Enter Name:</td>
  <td><form:input path="name"/></td>
  </tr>
  
  <tr>
  <td>Enter Password:</td>
  <td><form:input path="password"/></td>
  </tr>
  
  <tr>
  <td><input type="submit" value="sign in"/></td>
  </tr>
  </table>
 </form:form>
  
</body>
</html>