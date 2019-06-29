package com.home;

import org.springframework.stereotype.Component;

@Component
public class TimePassBean {
	
String cptyProp="BOOK1,BOOK2,BOOK3x";	

//ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//HelloWorld hello = (HelloWorld) context.getBean("helloBean");

    
    public String getProperty()
    {
    	HelloWorld hello = BeanUtil.getBean(HelloWorld.class);
    	
    	return hello.getHi();   	
    }
    
    /*public String loadLinker()
    {
        return "Linker is loaded";   	
    }*/
    
    /*@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}*/

}
