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
public class GetterInjectedControllerTest {

	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp() throws Exception{
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void test() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, this.setterInjectedController.sayHello());
	}

}
