<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
<body bgcolor="cyan">
<html:form action="/global">
<h1>Global Exceptions are here </h1>
<table>
<tr>
<td><bean:message key="login.color"/></td>
<td><html:text property="globalcolor"/></td>
</tr>
<tr>
<td><html:submit value="Enter"/></td>
<td><html:submit value="Enter"/></td>
</tr>
</table>
</html:form>
<html:form action="/local">
<table>
<tr>
<td><bean:message key="login.colors"/></td>
<td><html:text property="localcolor"/></td>
</tr>
<tr>
<td><html:submit value="Enter"/></td>
<td><html:submit value="Enter"/></td>
</tr>
</table>
</html:form>
</body>
</html:html>