package com.nama.jdbcclientdemo.controller;


import com.nama.jdbcclientdemo.model.Person;
import com.nama.jdbcclientdemo.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
public class PersonRestController {
	
	Logger log = LoggerFactory.getLogger(PersonRestController.class);
	
	
	@Autowired
	PersonRepository prepo;
	
		
	@RequestMapping("/add/person")
	public Person addPerson(@RequestParam("firstname") String firstname,
							  @RequestParam("lastname") String lastname)
	{

		log.debug("requestparam:firstname:"+firstname+",lastname:"+lastname);
		Person p = new Person(null,firstname,lastname, Instant.now());
		return prepo.save(p);

	}

	@GetMapping("/remove/person/{pid}")
	public int removeEmployee(@PathVariable long pid) {
		log.debug("pathparam:pid:"+pid);
		return prepo.delete(pid);
       
	}

	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		log.debug("get all persons..");
		return prepo.findAll();

	}
	
	
	
	
}
