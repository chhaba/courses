/**
 * 
 */
package com.codotics.demo.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codotics.demo.model.Book;

/**
 * @author Codotics Technologies
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
