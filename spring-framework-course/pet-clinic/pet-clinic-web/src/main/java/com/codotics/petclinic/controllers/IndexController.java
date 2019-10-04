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
public class IndexController {

	@RequestMapping({ "", "/", "index", "index.html" })
	public String index() {
		return "index";
	}
}
