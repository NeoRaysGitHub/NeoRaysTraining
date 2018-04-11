package com.cluster.studentadmissioncontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	public boolean perHandle(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception {
		
		Calendar cal=Calendar.getInstance();
		int dayOfWeek=cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek==1){
			response.getWriter().write("The website is close on Sunday's please try accessing it"+"on any other week days");
			return false;
		}
		return true;
	}

}
