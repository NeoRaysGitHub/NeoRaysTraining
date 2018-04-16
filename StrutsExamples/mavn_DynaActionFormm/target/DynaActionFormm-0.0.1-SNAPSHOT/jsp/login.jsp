<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
<body bgcolor="pink">
<html:form action="/login">
<table>
	<tr>
		<td><bean:message key="login.username"/></td>
		<td><html:text property="username"/></td> 
	</tr>
	<tr>
		<td><bean:message key="login.password"/></td>
		<td><html:text property="password"/></td>
	</tr>
</table>
<html:submit value="enter"></html:submit>
</html:form>
</body>
</html:html>