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
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Primary German Greeting Service";
	}

}
