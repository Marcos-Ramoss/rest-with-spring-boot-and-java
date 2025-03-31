package br.com.marcos.rest_with_spring_boot_and_java_marcos.exceptions;

import java.io.Serializable;
import java.sql.Date;

public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(java.util.Date timestamp, String message, String details) {
        this.timestamp = (Date) timestamp;
        this.message = message;
        this.details = details;
    }


    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    
}
