/**
 * 
 */
package com.codotics.controllers;

import com.codotics.services.GreetingService;

/**
 * @author Codotics Technologies
 *
 */
public class ConstructorInjectedController {

	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
