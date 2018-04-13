<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

	<html:html>
		<body bgcolor="cyan">
		
		1:-<a href="hello.jsp">forward with HTML hyperlink using href</a>
		<br>
		<br>
		2:-<html:link page="/hello.jsp">forward with Struts hyperlink customtag</html:link>
		<br>
		3:-<html:link forward="hai">forward with global forward</html:link>
		<br>
		<br>
		4:-<html:link action="cluster">forward with FowardAction</html:link>
		</body>
	
</html:html>