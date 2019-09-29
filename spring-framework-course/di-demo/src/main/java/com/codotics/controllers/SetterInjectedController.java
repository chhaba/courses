/**
 * 
 */
package com.codotics.controllers;

import com.codotics.services.GreetingService;

/**
 * @author Codotics Technologies
 *
 */
public class SetterInjectedController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
