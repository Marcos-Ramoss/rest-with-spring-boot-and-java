package br.com.marcos.rest_with_spring_boot_and_java_marcos.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcos.rest_with_spring_boot_and_java_marcos.converters.NumberConverter;
import br.com.marcos.rest_with_spring_boot_and_java_marcos.exceptions.UnsupporteMathOperationException;
import br.com.marcos.rest_with_spring_boot_and_java_marcos.math.SimpleMath;

@RestController
public class MathController {

    private final AtomicLong gerarId = new AtomicLong();
    private final SimpleMath math = new SimpleMath();


    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        return math.sum(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }

    
    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        return math.sub(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }
    

    @RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mult(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        return math.mult(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }


    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        return math.div(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }
    

    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        return math.mean(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
    }


    @RequestMapping(value="/sqr/{number}", method=RequestMethod.GET)
    public Double sqr(@PathVariable("number") String number) throws Exception {
        return math.sqr(NumberConverter.covertToDouble(number));
    }
    
    
    
    
    
    
    
    
    




    


    
    




   

}
