<html>
<body bgcolor="orange">
<h1>WITHOUT EL AND USING JAVA CODE</h1>
<%
     String strfname = request.getParameter("fname");
     String strlname = request.getParameter("lname");
     String strph = request.getParameter("ph");
     String arrph[] = request.getParameterValues("ph");
%>

First Name : <%=strfname %><br>
Last  Name  :<%=strlname %><br>
Primary Phone :<%=strph  %><br>
Primary Phone  :<%=arrph[0] %><br>
Secondary phone :<%=arrph[1] %><br>

</body>

</html>