/**
 * 
 */
package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/**
 * @author Ganga Prasanna Mogaparthi
 * Nov 11, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);

}
