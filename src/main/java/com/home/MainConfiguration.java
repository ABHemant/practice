package com.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.home.value.BookValue;
import com.home.value.CounterPartyValues;

@Configuration
public class MainConfiguration {
	
	@Value("${cpty.values}") 
	String counterPartyValues;
	
	@Value("${counterparty.load}") 
	String counterPartyBook;
	
	@Bean
	CounterPartyValues getcptyvalues()
	{
		CounterPartyValues cptyValues=new CounterPartyValues();
		cptyValues.setCptyValues(counterPartyValues);
		return cptyValues;
	}
	
	@Bean
	BookValue getBook()
	{
		BookValue book=new BookValue();
		book.setCptyBook(counterPartyBook);
		return book;
	}	
	
/*	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
*/
}
