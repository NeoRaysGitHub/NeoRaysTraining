package com.neorays.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class MainTest {

    public static void main(String[] args){

    	Configuration cfg = new Configuration();
    	try{
    		Template template=cfg.getTemplate("src/template/helloworld.ftl");
    		cfg.setDefaultEncoding("UTF-8");
    		cfg.setLocale(Locale.US);
    		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

    		Map<String, Object> input = new HashMap<String, Object>();

    		input.put("title", "FreeMarker example");

    		input.put("exampleObject", new ValueExampleObject("Java object", "me"));

    		List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
    		systems.add(new ValueExampleObject("Android", "Google"));
    		systems.add(new ValueExampleObject("iOS States", "Apple"));
    		systems.add(new ValueExampleObject("Ubuntu", "Canonical"));
    		systems.add(new ValueExampleObject("Windows7", "Microsoft"));
    		input.put("systems", systems);


    		template = cfg.getTemplate("src/template/helloworld.ftl");

       
    		Writer console = new OutputStreamWriter(System.out);
    		template.process(input, console);

       
    		Writer file = new FileWriter(new File("output.html"));
    		template.process(input, file);
    		}
    		catch(IOException e){
    		e.printStackTrace();
    		}
    		catch(TemplateException e){
    		e.printStackTrace();
    		}

    	}
}
