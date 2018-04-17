package com.neo.lang;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import  com.neo.lang.StudentDTO;

public class EL extends HttpServlet
 {
		public void doGet(HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
			String strSid = req.getParameter("sid");
			int intId = Integer.parseInt(strSid);
			
			StudentDTO sto = new StudentDTO();
			sto.setId(intId);
			sto.setName("AAAA");
			sto.setPhone("1111111");

			HttpSession ses = req.getSession();
			ses.setAttribute("STO", sto);
			RequestDispatcher rd = req.getRequestDispatcher("./jsp/usingEl.jsp");
			rd.forward(req, res);
		}
}
