/**
 * 
 */
package com.codotics.petclinic.services;

import java.util.Set;

import com.codotics.petclinic.model.Owner;

/**
 * @author Codotics Technologies
 *
 */
public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
