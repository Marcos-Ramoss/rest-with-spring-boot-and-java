package br.com.marcos.rest_with_spring_boot_and_java_marcos.service;

import java.util.ArrayList;
import java.util.List;
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
        return new Person();
    }

    public List<Person> findAll() {
        logger.info("Buscando todas as pessoas!");

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(mockPerson(i));
        }
        return persons;
    }

    public Person create(Person person) {
        logger.info("Criando uma pessoa!");
        return person;
    }

    public Person update(Person person) {
        logger.info("Atualizando uma pessoa!");
        return person;
    }


    public void delete(String id) {
        logger.info("Deletando uma pessoa!");
    }




    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Marcos " + i);
        person.setLastName("Ferreira " + i);
        person.setAddress("Manaus - AM " + i);
        person.setGender("Male");

        return person;
    }
}
