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

public class EmployeeJasper1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try{
		// TODO Auto-generated method stub
		/*
		 * JasperReport is the object that holds our compiled jrxml file
		 */
		JasperReport jasperReport;

		/*
		 * JasperPrint is the object contains report after result filling
		 * process
		 */
		JasperPrint jasperPrint;

		// connection is the data source we used to fetch the data from
		Connection connection = establishConnection();
		// jasperParameter is a Hashmap contains the parameters
		// passed from application to the jrxml layout
		HashMap jasperHashMap = new HashMap();
		jasperHashMap.put("ReportTitle", "Basic JasperReport");
		// jrxml compiling process
		jasperReport = JasperCompileManager.compileReport("D:/JasperReport/employee.jrxml"); // its working
		// .compileReport("/JR-Demo/src/main/java/com/neorays/jrxml/sample_report.jrxml");
		// //its not working
		// .compileReport("com/neorays/jrxml/sample_report.jrxml"); //its not
		// working
				

		// filling report with data from data source

		jasperPrint = JasperFillManager.fillReport(jasperReport,
				jasperHashMap, connection);
		
		/*// exporting process
		// 1- export to PDF
		JasperExportManager.exportReportToPdfFile(jasperPrint,
				"D:/JasperReport/report3.pdf");

		// 2- export to HTML
		JasperExportManager.exportReportToHtmlFile(jasperPrint,
				"D:/JasperReport/report3.html");
				
*/
		JasperExportManager.exportReportToPdfFile(jasperPrint,
				"D:/JasperReport/report3.pdf");
		// 3- export to Excel sheet
		JRXlsExporter exporter = new JRXlsExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
				"D:/JasperReport/report3.xls");
		exporter.exportReport();
		/*OutputStream ouputStream
	    = new FileOutputStream(new File("D:/catalog1.xls"));
	ByteArrayOutputStream byteArrayOutputStream
	    = new ByteArrayOutputStream();
		
		JRXlsExporter exporterXLS = new JRXlsExporter();
		exporterXLS.setParameter(JRXlsExporterParameter.JASPER_PRINT,
				jasperPrint);
		exporterXLS.setParameter(JRXlsExporterParameter.OUTPUT_STREAM,
		                         byteArrayOutputStream);
		exporterXLS.exportReport();
		ouputStream.write(byteArrayOutputStream.toByteArray()); 
		ouputStream.flush();
		ouputStream.close();*/
		
		/*exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, Boolean.TRUE);
		exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);
		exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "D://report3.xls"); 
		exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE); 
		exporter.exportReport(); */
        
		
		}
		catch(JRException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw = response.getWriter();
		pw.println("<h2>Report Genarated in the Target Folder..(D:/JasperReport/report3.xls)</h2><br/>");
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
