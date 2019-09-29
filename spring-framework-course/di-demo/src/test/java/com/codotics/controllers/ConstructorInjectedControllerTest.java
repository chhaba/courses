/**
 * 
 */
package com.codotics.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codotics.services.GreetingServiceImpl;

/**
 * @author Codotics Technologies
 *
 */
public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, this.constructorInjectedController.sayHello());
	}

}
