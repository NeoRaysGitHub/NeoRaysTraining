<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html>
	<body bgcolor="yellow">
		
			<a href="hello.jsp">forward with HTML hyperlink using href</a>
			<br> 
			<br>
			<html:link page="/hello.jsp">forward with Struts hyperlink customtag</html:link>
			<br> 
			<br>
			<html:link forward="hai">forward with global forward</html:link>
			<br>
			<html:link action="cluster">forward with FowardAction</html:link>
	</body>
</html:html>