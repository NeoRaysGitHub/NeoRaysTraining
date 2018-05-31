package com.neo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

@EnableWebMvc
@ComponentScan(basePackages={"com.neo.controller","com.neo.service"})
public class WebConfig extends WebMvcConfigurerAdapter {
	
	 @Autowired
	 private ApplicationContext applicationContext;
/*
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}*/
	
	 @Bean
	   public SpringResourceTemplateResolver templateResolver() {
		 System.out.println("SpringResourceTemplateResolver");
	      SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	      templateResolver.setApplicationContext(applicationContext);
	      templateResolver.setPrefix("/WEB-INF/template/");
	      templateResolver.setSuffix(".html");
	      return templateResolver;
	   }
	 
	 /*
	    * STEP 2 - Create SpringTemplateEngine
	    * */
	   @Bean
	   public SpringTemplateEngine templateEngine() {
		   System.out.println("SpringTemplateEngine");
	      SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	      templateEngine.setTemplateResolver(templateResolver());
	      //templateEngine.setEnableSpringELCompiler(true);
	      return templateEngine;
	   }
	   
	   /*
	    * STEP 3 - Register ThymeleafViewResolver
	    * */
	  @Override
	   public void configureViewResolvers(ViewResolverRegistry registry) {
			 System.out.println("configureViewResolvers");

		      ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		      resolver.setTemplateEngine(templateEngine());
		      registry.viewResolver(resolver);
			
		}
}
