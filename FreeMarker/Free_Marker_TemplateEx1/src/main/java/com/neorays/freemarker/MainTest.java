package com.neorays.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class MainTest {

 public static void main(String[] args) throws Exception {
  /* The main entry point into the FreeMarker API;
   *  encapsulates the configuration settings of FreeMarker, 
   *  also serves as a central template-loading and caching service. */
  Configuration cfg = new Configuration();
  
  
  Map<String, List<Employee>> input = new HashMap<String, List<Employee>> ();
  
  List<Employee> employees = new ArrayList<Employee>();
  employees.add(new Employee("Harishankar", "Pradhan"));
  employees.add(new Employee("Suresh", "Kumar"));
  employees.add(new Employee("Bharat", "Ariwar"));
  employees.add(new Employee("Mithilesh", "mukharjee"));
  input.put("employees", employees);

  /* Retrieves the template with the given name */
  Template template = cfg.getTemplate("src/main/java//employee.ftl");

  Writer consoleWriter = new OutputStreamWriter(System.out);
  Writer fileWriter = new FileWriter(new File("output.html"));
  
  /* Executes template, using the data-model provided,
   *  writing the generated output to the supplied Writer.  */
  template.process(input, consoleWriter);

  try {
   template.process(input, fileWriter);
  } finally {
   fileWriter.close();
  }

 }
}
