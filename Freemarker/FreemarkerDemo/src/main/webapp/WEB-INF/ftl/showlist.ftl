<html>
List in FreeMarker .. <br/>
<body>

<#list userList as user>
  ${user}
</#list>
<br/>
<a href="/FreemarkerDemo/">Log Out</a><br/>
<#if username == "Suresh">
  Session is there
</#if>

<br/>
<br/>
<#include "*/WEB-INF/ftl/footer.ftl">
 </body>
 </html>