package com.codotics.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.codotics.demo.model.Author;
import com.codotics.demo.model.Book;
import com.codotics.demo.model.Publisher;
import com.codotics.demo.model.repositories.AuthorRepository;
import com.codotics.demo.model.repositories.BookRepository;
import com.codotics.demo.model.repositories.PublisherRepository;

/**
 * 
 * @author Codotics Technologies
 *
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();

	}

	private void initData() {
		Publisher harperCollins = new Publisher("Harper Collins", "New York");
		
		// Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", harperCollins);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		publisherRepository.save(harperCollins);
		authorRepository.save(eric);
		bookRepository.save(ddd);

		Publisher wrox = new Publisher("Wrox", "New Delhi");
		// Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23456", wrox);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		publisherRepository.save(wrox);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
	}

}
