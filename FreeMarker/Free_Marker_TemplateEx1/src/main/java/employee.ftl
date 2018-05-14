<html>
<head>
  <title>Hello File Marker</title>
</head>
<body>
  <ul>
    <#list employees as employee>
      <li>${employee.firstName}  ${employee.lastName}</li>
    </#list>
  </ul>
</body>
</html>