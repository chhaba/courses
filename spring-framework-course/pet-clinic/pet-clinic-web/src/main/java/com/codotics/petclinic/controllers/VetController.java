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
public class VetController {

	@RequestMapping({ "/vets", "/vets/index", "/vets/index.html" })
	public String listVets() {
		return "vets/index";
	}
}
