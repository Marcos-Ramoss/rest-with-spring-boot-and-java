package br.com.marcos.rest_with_spring_boot_and_java_marcos.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointControllerHello {

    private static final String template = "Hello, %s! ";
    private final AtomicLong gerarId = new AtomicLong();


   @RequestMapping("/hello") 
   public EndpointHello endpointHello(@RequestParam(value="name", defaultValue = "World") String name){
    return new EndpointHello(gerarId.incrementAndGet(), String.format(template, name));
   }

}
