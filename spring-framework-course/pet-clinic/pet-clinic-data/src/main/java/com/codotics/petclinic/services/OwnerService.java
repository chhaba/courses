/**
 * 
 */
package com.codotics.petclinic.services;

import com.codotics.petclinic.model.Owner;

/**
 * @author Codotics Technologies
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
