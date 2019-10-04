/**
 * 
 */
package com.codotics.petclinic.services;

import java.util.Set;

import com.codotics.petclinic.model.Vet;

/**
 * @author Codotics Technologies
 *
 */
public interface VetService {

	Vet findById(Long id);

	Vet save(Vet net);

	Set<Vet> findAll();
}
