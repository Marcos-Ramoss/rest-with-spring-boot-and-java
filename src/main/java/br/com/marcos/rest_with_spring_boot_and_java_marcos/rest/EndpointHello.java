package br.com.marcos.rest_with_spring_boot_and_java_marcos.rest;


public class EndpointHello {

    private final Long id;
    private final String content;

    public EndpointHello(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    

}
