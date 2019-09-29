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
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus !!!";

	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}
