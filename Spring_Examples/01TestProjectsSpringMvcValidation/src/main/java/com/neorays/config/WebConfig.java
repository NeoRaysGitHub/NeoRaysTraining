package com.neorays.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.neorays.controller","com.neorays.validator"})
public class WebConfig {
	
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	
	@Bean
	public MessageSource source()
	{
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasenames("msg");
		return messageSource;
		
		
	}
	

}
