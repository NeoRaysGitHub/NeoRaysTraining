package com.example.demo.config;

import javax.annotation.Resource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.castor.CastorMarshaller;

import com.example.demo.xmlconverter.XmlConverter;

@Configuration
public class AppConfig {
	
	@Resource
	ConfigurableApplicationContext appContext;
	
	@Bean
	public XmlConverter xmlConverter(){
		XmlConverter xmlConverter=new XmlConverter();
		xmlConverter.setMarshaller(castorMarshaller());
		xmlConverter.setUnmarshaller(castorMarshaller());
		return new XmlConverter();
	}
	
	@Bean
	public CastorMarshaller castorMarshaller(){
		CastorMarshaller castorMarshaller=new CastorMarshaller();
		castorMarshaller.setMappingLocation(appContext.getResource("classpath:mapping.xml"));
		return new CastorMarshaller();
	}

}
