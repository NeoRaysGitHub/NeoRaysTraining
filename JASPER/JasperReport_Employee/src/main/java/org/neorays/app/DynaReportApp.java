package org.neorays.app;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import org.neorays.bean.Employee;
import org.neorays.report.EmployeeReport;

import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;


public class DynaReportApp {

  public static void main(String[] args) {

      Collection<Employee> list = new ArrayList<>();

      list.add(new Employee(101, "Pradeep",  67000, (float) 2.5));
      list.add(new Employee(102, "Suresh",  90000, (float) 9.5));
      list.add(new Employee(103, "Mithilesh Kumar",  73545, (float) 1.5));
      list.add(new Employee(104, "ManjuNath",  43988, (float) 0.5));
      list.add(new Employee(105, "Bharat",  93877, (float) 3.5));
      list.add(new Employee(106, "Jagabandhu",  72000, (float) 2.3));
      list.add(new Employee(107, "Sachin Pattnayak",  33000, (float) 1.4));
      list.add(new Employee(108, "Bikash",  92000, (float) 6.2));
      list.add(new Employee(109, "Bharat Ariwar",  55000, (float) 8.5));
      list.add(new Employee(110, "Dinesh khagitala",  89000, (float) 8.2));
      
      EmployeeReport report = new EmployeeReport(list);

      try {
          JasperPrint jp = report.getReport();
          JasperViewer jasperViewer = new JasperViewer(jp);
          jasperViewer.setVisible(true);

      } catch (Exception ex) {

      }
  }
}