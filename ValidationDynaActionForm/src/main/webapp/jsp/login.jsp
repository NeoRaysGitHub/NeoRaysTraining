<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="pink">
	<html:form action="/login">
	<table>
		<tr>
			<td><bean:message key="login.name"/></td><br>
			<td><html:text property="Name"/></td>
		</tr>
		<tr>
			<td><bean:message key="login.password"/></td><br>
			<td><html:text property="Password"/></td>
		</tr>
	</table>
	<html:submit value="Enter"/>
	</html:form>
	</body>
</html:html>