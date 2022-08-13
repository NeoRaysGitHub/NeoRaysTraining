<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
<body bgcolor="red">
<html:form action="/login">
<table>
<tr>
<td><bean:message key="login.userName"/></td>
<td><html:text property="username"/></td>
<td><html:errors property="username"/></td>
</tr>
<tr>
<td><bean:message key="login.password"/></td>
<td><html:password property="password"/></td>
<td><html:errors property="password"/></td>
</tr>
<tr><td><html:submit value="submit"/></td></tr>
</table>
</html:form>
</body>
</html:html>