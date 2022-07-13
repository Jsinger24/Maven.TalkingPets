package io.zipcoder.polymorphism;

public class Pets {
    private String name;
    private String speak;
    private String typeOf;



    public Pets(String name) {
        this.name = name;
    }


    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
