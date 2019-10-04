/**
 * 
 */
package com.codotics.petclinic.services;

import java.util.Set;

import com.codotics.petclinic.model.Pet;

/**
 * @author Codotics Technologies
 *
 */
public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
