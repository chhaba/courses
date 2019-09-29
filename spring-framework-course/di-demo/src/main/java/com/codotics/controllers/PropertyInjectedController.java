/**
 * 
 */
package com.codotics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.codotics.services.GreetingService;

/**
 * @author Codotics Technologies
 *
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	// We can use the Qualifier or object name match the service implementation name
	// Using Qualifier is recommended
//	@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
