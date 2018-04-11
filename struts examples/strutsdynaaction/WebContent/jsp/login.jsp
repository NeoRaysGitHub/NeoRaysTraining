<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
<body bgcolor="wheat">
<html:form action="/login">
<table>
<tr>
<td><bean:message key="login.user"/></td>
<td><html:text property="userName"></html:text> </td>
</tr>
<tr>
<td><bean:message key="login.password"/></td>
<td><html:password property="password"></html:password></td>
</tr>
</table>
<html:submit value="enter"></html:submit>
</html:form>
</body>
</html:html>