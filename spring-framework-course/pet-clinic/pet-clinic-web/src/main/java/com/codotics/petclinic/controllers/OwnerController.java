/**
 * 
 */
package com.codotics.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Codotics Technologies
 *
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOwners() {
		return "owners/index";
	}
}
