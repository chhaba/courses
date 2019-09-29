/**
 * 
 */
package com.codotics.controllers;

import com.codotics.services.GreetingServiceImpl;

/**
 * @author Codotics Technologies
 *
 */
public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
