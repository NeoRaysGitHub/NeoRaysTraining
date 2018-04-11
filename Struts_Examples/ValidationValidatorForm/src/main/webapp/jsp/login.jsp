<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
	<body bgcolor="pink">
		<html:form action="/login" onsubmit="return validateLoginForm(this)">
		<html:javascript formName="loginForm"/>
		<table>
			<tr>
				<td><bean:message key="login.name"/></td>
				<td><html:text property="name"/></td>
				<td><html:errors property="name"/></td>
			</tr>
			<tr>
				<td><bean:message key="login.password"/></td>
				<td><html:text property="password"/></td>
				<td><html:errors property="password"/></td>
			</tr>
		</table>
		<html:submit value="Enter"></html:submit>
		</html:form>
	</body>
</html:html>