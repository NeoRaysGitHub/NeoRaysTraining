<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
<body bgcolor="cyan">
<a href="hello.jsp">USING HTML Anchor tag</a><br>
<html:link page="/jsp/hello.jsp">USING struts page hyperlink</html:link><br>
<html:link forward="hai">Forward with struts Forward hyper link</html:link><br>
<html:link action="/cluster">Cluster</html:link>
</body>
</html:html>