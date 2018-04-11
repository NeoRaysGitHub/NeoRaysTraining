import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Show extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
	 ArrayList al = new ArrayList();
	 al.add("dinesh");
	 al.add("suresh");
	 al.add("sachin");
	 al.add("nothing");
	 
	 HttpSession ses = req.getSession();
	ses.setAttribute("NAMES",al);
	RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
	rd.forward(req,res);
	}
}