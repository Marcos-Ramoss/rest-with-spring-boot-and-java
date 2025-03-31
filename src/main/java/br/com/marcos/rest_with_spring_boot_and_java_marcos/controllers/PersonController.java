package br.com.marcos.rest_with_spring_boot_and_java_marcos.controllers;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcos.rest_with_spring_boot_and_java_marcos.model.Person;
import br.com.marcos.rest_with_spring_boot_and_java_marcos.service.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
   
   @Autowired
   private PersonServices service;

   @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   public Person findById(@PathVariable(value ="id") String id) throws Exception {
   
      return service.findById(id);

   
}

}