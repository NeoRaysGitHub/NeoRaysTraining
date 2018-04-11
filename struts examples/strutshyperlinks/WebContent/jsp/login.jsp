<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
<body bgcolor="yellow">

<a href="/jsp/hello.jsp">forward with html hyperlink using href</a>
<br>
<br>
<html:link page="/jsp/hello.jsp">forward with struts hyperlink customtag </html:link>
<br>
<br>
<html:link forward="hai">forward with global forward </html:link>
<br>
<html:link action="cluster">forward with forward with forward action </html:link>

</body>
</html:html>