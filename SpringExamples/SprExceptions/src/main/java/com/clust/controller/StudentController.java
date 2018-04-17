package com.clust.controller;

	import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clust.customexceptions.StudentNotFoundException;
import com.clust.model.Student;


	@Controller
	public class StudentController {
		
		private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
		@RequestMapping(value="/stu/{id}", method=RequestMethod.GET)
		public String getStudent(@PathVariable("id") int id, Model model) throws Exception{
			
			//deliberately throwing different types of exception
			if(id==1)
			{
				throw new StudentNotFoundException(id);
			}
			else if(id==2)
			{
				throw new SQLException("SQLException, id="+id);
			}
			else if(id==3)
			{
				throw new IOException("IOException, id="+id);
			}
			else if(id==11)
			{
				Student stu = new Student();
				stu.setName("Deepa");
				stu.setId(id);
				model.addAttribute("student", stu);
				return "home";
			}
			else 
			{
				throw new Exception("Generic Exception, id="+id);
			}
			
		}
		
		@ExceptionHandler(StudentNotFoundException.class)
		public ModelAndView handleStudentNotFoundException(HttpServletRequest request, Exception ex){
			logger.error("Requested URL="+request.getRequestURL());
			logger.error("Exception Raised="+ex);
			
			ModelAndView modelAndView = new ModelAndView();
		    modelAndView.addObject("exception", ex);
		    modelAndView.addObject("url", request.getRequestURL());
		    
		    modelAndView.setViewName("error");
		    return modelAndView;
		}	
	}

