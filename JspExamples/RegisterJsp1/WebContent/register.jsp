<%@page import="java.sql.*" %>

<%!Connection cn; %>

<%!
public void jspInit()
{
	try{
		Class.forName("org.postgresql.Driver");
		cn=DriverManager.getConnection("jdbc:postgresql://localhost:5433/hari","postgres","cluster");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
%>
<%!
	public void jspDestroy()
	{
		System.out.println("desroy()..");
		try{
			cn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
%>
<html>
<body>
<%
	String name=request.getParameter("ename");
	String pass=request.getParameter("epass");
	String email=request.getParameter("eemail");
	String phone=request.getParameter("ephone");
	PreparedStatement ps=null;
	try{
		ps=cn.prepareStatement("INSERT INTO Customer(name,pass,email,phone) VALUES(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, pass);
		ps.setString(3, email);
		ps.setString(4, phone);
		
		int i=ps.executeUpdate();
		
		if(i==1)
		{
			out.println("<center><b>!!!Register Successfull!!!!</b><center>");
			
		}else
		{
			out.println("note success");
		}
	cn.close();		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally{
		ps.close();
	}
%>
</body>
</html>