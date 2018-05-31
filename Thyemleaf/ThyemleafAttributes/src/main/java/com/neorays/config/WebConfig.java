package com.neorays.config;


import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.neorays"})
public class WebConfig extends WebMvcConfigurerAdapter{
	
	 private ApplicationContext applicationContext;

	  public void setApplicationContext(ApplicationContext applicationContext) {
	    this.applicationContext = applicationContext;
	  }

	 @Bean
	   public SpringResourceTemplateResolver templateResolver() {
		 System.out.println("SpringResourceTemplateResolver");
	      SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	      templateResolver.setApplicationContext(applicationContext);
	      templateResolver.setPrefix("/WEB-INF/templates/");
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
