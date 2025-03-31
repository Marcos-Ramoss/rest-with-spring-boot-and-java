package br.com.marcos.rest_with_spring_boot_and_java_marcos.math;



public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) throws Exception {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) throws Exception {
        return numberOne -numberTwo;

    }

    public Double mult(Double numberOne, Double numberTwo) throws Exception {
        return numberOne * numberTwo;

    }

    public Double div(Double numberOne, Double numberTwo) throws Exception {
        return numberOne / numberTwo;

    }

    public Double mean(Double numberOne, Double numberTwo) throws Exception {
        return ((numberOne) + (numberTwo)) / 2;
    }

    public Double sqr(Double number)
            throws Exception {
        return Math.sqrt((number));
    }
}
