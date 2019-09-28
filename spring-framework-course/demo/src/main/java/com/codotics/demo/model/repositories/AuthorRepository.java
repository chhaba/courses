package com.codotics.demo.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codotics.demo.model.Author;

/**
 * 
 * @author Codotics Technologies
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
