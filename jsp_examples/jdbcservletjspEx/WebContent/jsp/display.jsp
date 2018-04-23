<%@ page import="com.cluster.to.ChessDetails"%>
<html>
<body bg color="green">
<center>
<h1>User Details</h1>
<%
ChessDetails details=(ChessDetails)request.getAttribute("pto");
%>
<font size=6 color="red">
Your Name is : <%=details.getName() %><br>
Your Password is : <%=details.getPassword()%><br>
Your Phone Number is : <%=details.getPhone()%><br>
Your Email is : <%=details.getEmail()%><br>
Your Chess Rating : <%=details.getRating() %>
</font>
</center>
</body>
</html>