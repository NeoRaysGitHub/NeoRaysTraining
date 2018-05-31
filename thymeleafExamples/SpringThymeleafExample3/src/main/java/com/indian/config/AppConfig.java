package com.indian.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;


@Configuration
@EnableWebMvc
@ComponentScan()
public class AppConfig  extends WebMvcConfigurerAdapter{

	@Autowired
 ApplicationContext applicationContext;
	@Bean
	public SpringResourceTemplateResolver templateResolver(){
		SpringResourceTemplateResolver templateresolver = new SpringResourceTemplateResolver();
   templateresolver.setApplicationContext(applicationContext);
	templateresolver.setPrefix("/WEB-INF/views/");
	templateresolver.setSuffix(".html");
	
	return templateresolver;
	}
	@Bean
	public SpringTemplateEngine templateEngine(){
		SpringTemplateEngine templateEngine=new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		templateEngine.setEnableSpringELCompiler(true);
		return templateEngine;
		
	}
	
	public void configureViewResolvers (ViewResolverRegistry registry){
	ThymeleafViewResolver viewResolver=new 	ThymeleafViewResolver();
	viewResolver.setTemplateEngine(templateEngine());
	registry.viewResolver(viewResolver);
	}
}
