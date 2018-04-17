<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>
First Name	: ${requestScope.FNAME} or ${FNAME} or ${requestScope["FNAME"]} <br>
Phone		: ${applicationScope.PH} or ${PH} or ${applicationScope["PH"]}<br>
</h1>

<h2>
country: ${initParam.country}

</h2>
</body>
</html>