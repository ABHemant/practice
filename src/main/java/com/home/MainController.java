package com.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.different.TradeFeedClass;


@RestController
public class MainController {

	@GetMapping("/hello")
	public String sayHello() {

		TradeFeedClass tr=new TradeFeedClass();
		return tr.checkCounterParty();
		
	}
}
