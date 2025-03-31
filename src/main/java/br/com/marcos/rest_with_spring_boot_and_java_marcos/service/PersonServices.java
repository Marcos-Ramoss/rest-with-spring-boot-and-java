package br.com.marcos.rest_with_spring_boot_and_java_marcos.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import br.com.marcos.rest_with_spring_boot_and_java_marcos.model.Person;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Buscando uma pessoa!");
        
        Person person = new Person();   
        person.setId(counter.incrementAndGet());
        person.setFirstName("Marcos");
        person.setLastName("Ferreira");
        person.setAddress(" Manaus - AM");
        person.setGender("Male");

        return person;

    }
}
