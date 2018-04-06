<html>
<body bgcolor="wheat">
<h1>WITHOUT EL</h1>
<%
  String strcomp = request.getParameter("compname");
  String strsal = request.getParameter("salary");
 out.println("comapany name"+strcomp);
 out.println("salary"+strsal);
  
  Cookie cookie[] = request.getCookies();
   String cname,cvalue;
   for(int i=0;i<cookie.length;i++){
	   cname=cookie[i].getName();
	   if(cname.equals("fname")){
		   cvalue=cookie[i].getValue();
		 out.println(cvalue);
		 break;
	   }
	   
   }

%>


</body></html>