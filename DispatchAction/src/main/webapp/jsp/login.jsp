<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="pink">
		<html:form action="/login"> 
			<bean:message key="login.number1"/>
					<html:text property="number1"/>
				<bean:message key="login.number2"/>
					<html:text property="number2"/>
				
			<html:submit property="method">addition</html:submit>
			<html:submit property="method">multiply</html:submit>
			<html:submit property="method">subtract</html:submit>
			<html:submit property="method">division</html:submit>
		</html:form>
	</body>
</html:html>