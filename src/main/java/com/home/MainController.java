package com.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.different.TradeFeedClass;


@RestController
public class MainController {

	/*@Value("${cpty.value}")
	String just;*/



	@GetMapping("/hello")
	public String sayHello() {

		TradeFeedClass tr=new TradeFeedClass();

		return tr.getProperty();

		//return tr.loadLinker();
	}
}
