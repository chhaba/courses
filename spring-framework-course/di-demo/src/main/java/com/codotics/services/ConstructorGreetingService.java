/**
 * 
 */
package com.codotics.services;

import org.springframework.stereotype.Service;

/**
 * @author Codotics Technologies
 *
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the constructor";
	}

}
