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
// Default profile is active when there is no other profile active
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - English Primary Greeting Service";
	}

}