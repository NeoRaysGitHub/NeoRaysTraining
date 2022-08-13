<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page isELIgnored="false"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Here is the Data you want</h1><br><br><br><br>
${list }<br>
<%-- 
${list.user }<br>
${list.pass } --%>
eee
<c:if test="${!empty list}" >
"${list.user}
     "${list.pass}


</c:if>
<%-- <c:choose>
  <c:when test="${!empty list}">
    <table border="1" bgcolor="cyan">
      <tr style="color:red"><th>USER NAME</th><th>PASSWORD</th><tr>
      <c:forEach var="d"  items="${list}">
        <tr style="color:blue">
       <td><c:out value="${d.user}" /></td>
        <td> <c:out value="${d.pass}" /></td>
        </tr>
      </c:forEach>
    </table>
  </c:when>
  <c:otherwise>
    Records not found..
  </c:otherwise>
</c:choose>     --%>
</body>
 <br><br><br><br>
<a href="home.html">HOME</a>
</html>



