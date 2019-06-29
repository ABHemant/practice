package com.different;

import org.springframework.beans.factory.annotation.Value;

public class TradeFeedClass {
	
	String cptyProp="BOOK1,BOOK2,BOOK3x";
	
	@Value("${cpty.value}") 
	String just;
	
    public void checkProperty(){
    
    	String[] words=cptyProp.split(",");
    }
    
    public String getProperty()
    {
    	
    	return cptyProp;
    	
    }
    
    public String loadLinker()
    {
        return "Linker is loaded";   	
    }
	
	
}
