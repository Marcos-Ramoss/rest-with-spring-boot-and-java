package br.com.marcos.rest_with_spring_boot_and_java_marcos.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupporteMathOperationException extends RuntimeException {

    public UnsupporteMathOperationException(String ex) {
        super(ex);
      
    }

    private static final long serialVersionUID = 1L;

}
