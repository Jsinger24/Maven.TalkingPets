package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    public String speak(){
        System.out.println("meow");
        return "meow";
    }
}

