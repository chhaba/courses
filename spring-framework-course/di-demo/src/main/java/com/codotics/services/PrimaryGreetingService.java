/**
 * 
 */
package com.codotics.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Codotics Technologies
 *
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting Service";
	}

}
