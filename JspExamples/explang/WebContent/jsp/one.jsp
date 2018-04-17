<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.neo.lang.StudentDTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor='pink'>
<h1>Without EL and using java code</h1>
<%	
StudentDTO st=null;
Object object = session.getAttribute("STO");
if(object != null){
	st=(StudentDTO)object;
}
%>

	Student ID 	:<%= st.getId() %><br> 
	Name		:<%= st.getName() %><br>
	Phone		:<%=st.getPhone() %><br>
	

</body>
</html>