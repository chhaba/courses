/**
 * 
 */
package com.codotics.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Codotics Technologies
 *
 */
@Controller
public class MyController {

	public String hello() {
		System.out.println("Hello !!!");
		return "foo";
	}
}
