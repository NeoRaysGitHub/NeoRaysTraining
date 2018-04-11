<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html>
<body bgcolor="wheat">
<html:form action="/login">
<table>
<tr>
<td><bean:message key="login.sid"/></td>
<td><html:text property="sid"></html:text></td>
</tr>
</table>
<html:errors property="sid"/><br>
<html:submit value="submit"></html:submit>
</html:form>
</body>

</html:html>