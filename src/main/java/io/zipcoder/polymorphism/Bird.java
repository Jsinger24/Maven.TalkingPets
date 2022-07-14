package io.zipcoder.polymorphism;

public class Bird extends Pet {

    public Bird(String name)
    {super(name);}

    public String speak(){
        System.out.println("tweet tweet");
        return "tweet tweet";
    }


}
