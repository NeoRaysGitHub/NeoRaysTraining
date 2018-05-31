package com.neorays.jasper;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRXlsExporter;

/**
 * Servlet implementation class EmployeeJasperHtml
 */
public class EmployeeJasperHtml extends HttpServlet {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		try{
			// JasperReport is the object that holds our compiled jrxml file
			JasperReport jasperReport;

			// JasperPrint is the object contains report after result filling
			// process
			JasperPrint jasperPrint;

			// connection is the data source we used to fetch the data from
			Connection connection = establishConnection();
			// jasperParameter is a Hashmap contains the parameters
			// passed from application to the jrxml layout
			HashMap jasperHashMap = new HashMap();
			jasperHashMap.put("ReportTitle", "Basic JasperReport");
			// jrxml compiling process
			jasperReport = JasperCompileManager.compileReport("D:/JasperReport/employee.jrxml"); // its working
			
			// filling report with data from data source

			jasperPrint = JasperFillManager.fillReport(jasperReport,
					jasperHashMap, connection);

			// 2- export to HTML
			JasperExportManager.exportReportToHtmlFile(jasperPrint,
					"D:/JasperReport/report3.html");			
			}
			catch(JRException e){
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		pw.println("<h2>Report Genarated in the Target Folder..(D:/JasperReport/report3.html)</h2><br/>");
		pw.println("<a  href='index.jsp'> Home </a>");
		}// main method

		public static Connection establishConnection()
				throws ClassNotFoundException {
			Connection connection = null;
			try {
				Class.forName("org.postgresql.Driver");
				String postgreURL = "jdbc:postgresql:suresh";
				connection = DriverManager.getConnection(postgreURL, "postgres",
						"cluster");
				connection.setAutoCommit(false);
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
			return connection;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
