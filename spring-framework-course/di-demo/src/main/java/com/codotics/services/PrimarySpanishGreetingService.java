/**
 * 
 */
package com.codotics.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Codotics Technologies
 *
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Spanish Primary Greeting Service";
	}

}
