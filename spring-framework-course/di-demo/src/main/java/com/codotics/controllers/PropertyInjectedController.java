/**
 * 
 */
package com.codotics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codotics.services.GreetingServiceImpl;

/**
 * @author Codotics Technologies
 *
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
