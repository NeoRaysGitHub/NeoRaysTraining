<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LOGIN DETAILS</h1>

<c:choose>
  <c:when test="${!empty loginList}">
    <table border="1" bgcolor="cyan">
      <tr style="color:red"><th>USER NAME</th><th>PASSWORD</th><tr>
      <c:forEach var="dto"  items="${loginList}">
        <tr style="color:blue">
         <td>${dto.user}</td>
         <td>${dto.pass}</td>
        </tr>
      </c:forEach>
    </table>
  </c:when>
  <c:otherwise>
    Records not found..
  </c:otherwise>
</c:choose>    
<br><br>
<a href="login.html">home</a>

  
</body>
</html>