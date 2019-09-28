/**
 * 
 */
package com.codotics.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codotics.demo.model.repositories.BookRepository;

/**
 * @author Codotics Technologies
 *
 */
@Controller
public class BookController {

	private BookRepository bookRepository;

	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());

		// String "books" will be used in view.
		// This is basically template name
		return "books";
	}
}
