/**
 * 
 */
package com.codotics.controllers;

import org.springframework.stereotype.Controller;

import com.codotics.services.GreetingService;

/**
 * @author Codotics Technologies
 *
 */
@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello !!!");
		return greetingService.sayGreeting();
	}
}
