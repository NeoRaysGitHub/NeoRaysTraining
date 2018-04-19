<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<body bgcolor="pink">
	 <h1>Host Name:    ${header.host}</h1>
	 <h1>user Agent :    ${header["user-agent"]}</h1>
	 <h1>Accept Encoding :   ${header["accept-encoding"]}</h1>
	 <h1>Accept Language :   ${header["accept-language"]}</h1>
	 
	</body>
</html>
</body>
</html>