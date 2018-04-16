 <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html>
<body bgcolor="pink">
<html:form action="/search">
<table>
	<tr>
		<td><bean:message key="login.searchstudent"/></td>
		<td><html:text property="sid"/></td>
	</tr>
</table>
<html:submit value="enter"/>
</html:form>
<html:errors/>
</body>
</html:html>