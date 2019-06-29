package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.different.TradeFeedClass;


@RestController
public class MainController {

	/*@Value("${cpty.value}")
	String just;*/

	/*@Autowired
	HelloWorld hello;*/


	@GetMapping("/hello")
	public String sayHello() {

		//TradeFeedClass trx=new TradeFeedClass();
		TimePassBean tr=new TimePassBean();

		return tr.getProperty();

		//return hello.getHi();
	}
}
