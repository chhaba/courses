/**
 * 
 */
package com.codotics.petclinic.model;

import java.io.Serializable;

/**
 * @author Codotics Technologies
 *
 */
public class BaseEntity implements Serializable{

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
