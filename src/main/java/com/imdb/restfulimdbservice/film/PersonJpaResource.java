package com.imdb.restfulimdbservice.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonJpaResource {
	
	@Autowired
	private PersonRepository personRepository;
	
	
	@GetMapping("/jpa/persons")
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}

}
