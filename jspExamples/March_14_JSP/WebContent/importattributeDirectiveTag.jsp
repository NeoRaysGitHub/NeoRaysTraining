<%@ page import="java.util.Date,java.util.*,java.io.*" %>


<html>
<body>

<%@ page import="java.util.Date" %>
Today is: <%= new Date() %>
util:<%!ArrayList al=new ArrayList();%>
	<=al.add("bharath");>
	<=al.add("raja");>
	<%!Iterator it=al.iterator(); %>
	<%! while(it.hasnext())
	 	{System.out.println(it.next());
	}%>
	

</body>
</html>

