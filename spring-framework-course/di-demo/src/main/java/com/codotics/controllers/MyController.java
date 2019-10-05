/**
 * 
 */
package com.codotics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.TestClass;
import com.codotics.services.GreetingService;

/**
 * @author Codotics Technologies
 *
 */
@Controller
public class MyController {

	@Autowired
	TestClass testClass;
	
	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		testClass.sayHello();
		System.out.println("Hello !!!");
		return greetingService.sayGreeting();
	}
}
