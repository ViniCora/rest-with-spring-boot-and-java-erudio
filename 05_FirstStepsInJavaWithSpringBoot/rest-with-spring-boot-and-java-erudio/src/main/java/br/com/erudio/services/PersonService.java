package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service 
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			
			persons.add(person);
		}
		
		return persons;
	}
	
	public Person findById(String id) {
		
		logger.info("Finding new Person");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Vinicius");
		person.setLastName("Coradassi");
		person.setAdress("Curitiba - Paraná");
		person.setGender("M");
		
		return person;
	}
	
	public Person create(Person person) {
		
		logger.info("Creating new Person");
		
		return person;
	}
	
	public Person update(Person person) {
		
		logger.info("Creating new Person");
		
		return person;
	}
	
	public void delete(String id) {
		
		logger.info("Deleating new Person");
		
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person " + i);
		person.setLastName("Last name " + i);
		person.setAdress("Place: " + i);
		person.setGender("M");
		
		return person;
	}
	
}
