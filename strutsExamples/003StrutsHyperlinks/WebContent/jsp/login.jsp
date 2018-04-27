<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
	<body bgcolor="orange">
		<a href="hello.jsp">forward with HTML hyperlink using href</a><br>
		<br>
			<html:link page="/jsp/hello.jsp">forward with Struts hyperlink customtag</html:link>
			
			<br>
			<html:link forward="hai">forward with global forward</html:link>
			<br>
			<html:link action="maga">forward with FowardAction</html:link>
	</body>
</html:html>
