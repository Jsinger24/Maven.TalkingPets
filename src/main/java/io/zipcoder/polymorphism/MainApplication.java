package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        List<Pets> listOfPetNames = new ArrayList<Pets>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many pets do you have? Enter a number here : ");
        Integer numOfPets = userInput.nextInt();
        System.out.println("You have " + numOfPets + " pet(s)!");
        System.out.println("What kind of pet is pet " + listOfPetNames.size() + 1);
        String type = userInput.nextLine();
//        listOfPetNames.add(Pets.);
//        System.out.println("What is the name of pet " + listOfPetNames.size() + 1);
//        String name = userInput.nextLine();
//        listOfPetNames.add(name);
//        System.out.println("My pets are named " + listOfPetNames.toString());
//
//        Pets Bird = new Pets("Roscoe");
//        Bird.speak();
//        Pets Dog = new Pets(("Zoe"));


    }


}


