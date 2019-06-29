package com.home;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class MainConfiguration {
	
	@Value("${cpty.value}") 
	String just;
	
	/*@Bean
	public MyBean getcptyvalues()
	{
		MyBean h=new MyBean();
		return h;
		
	}*/
	
	@Bean/*(name="helloBean")*/
	HelloWorld getmy()
	{
		HelloWorld s=new HelloWorld();
		s.setHi(just);
		return s;
	}
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
