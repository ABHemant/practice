package com.different;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.home.MainConfiguration;

//@ComponentScan({"com.home"})
@Configuration
@Import({ MainConfiguration.class})
public class TradeFeedClass {
	
	
	
	String cptyProp="BOOK1,BOOK2,BOOK3x";
	
	/*@Value("${cpty.value}") 
	String just;*/
	
	/*String just="hey";*/
	
	@Autowired
	@Qualifier("myString")
	String hello;
	
    public void checkProperty(){
    
    	String[] words=cptyProp.split(",");
    }
    
    public String getProperty()
    {
    	System.out.print(hello);
    	//String just=mybean.getH(just);
    	return cptyProp;
    	
    }
    
    public String loadLinker()
    {
        return "Linker is loaded";   	
    }
    
    @Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
}
