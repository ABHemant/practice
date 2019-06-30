package com.home.different;

import com.home.util.BeanUtil;
import com.home.value.BookValue;
import com.home.value.CounterPartyValues;

public class TradeFeedClass {
	
    public Boolean checkValidCounterParty(String cptyValues,String bookValue){
    
    	String[] counterPartyArray=cptyValues.split(",");
       	
    	for(String cpty : counterPartyArray) 
    	{ 
    	    if(cpty.equalsIgnoreCase(bookValue))
    	    {
    	    	return true;
    	    }
    	}
    	
    	return false;
    	}
    
   public String checkCounterParty()
    {
    	CounterPartyValues cptyValues = BeanUtil.getBean(CounterPartyValues.class);
    	
    	BookValue bookValue = BeanUtil.getBean(BookValue.class);
    	
    	Boolean flag=checkValidCounterParty(cptyValues.getCptyValues(),bookValue.getCptyBook());
    	
    	if(flag)
    	{
    		return "Load Linker";	
    	}
    	else
    	{
    		return "Load Default";	
    	}
    }
}
