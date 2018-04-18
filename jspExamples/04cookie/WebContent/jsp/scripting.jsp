

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%
	//request parameters
	String strCompanyName = request.getParameter("compname");
	String strSalary = request.getParameter("sal");
	out.println("Company Name " + strCompanyName);
	out.println("Salary " + strSalary);
	
	//cookie values
	Cookie cookie[] = request.getCookies();
	String cname,cvalue;
	for (int i = 0; i < cookie.length; i++){
		cname = cookie[i].getName();
		if (cname.equals("FNAME")){
			cvalue = cookie[i].getValue();
			out.println("Cookie Value" + "	" + cvalue);
			break;
		}
	}
%>
</body>
</html>

</body>
</html>