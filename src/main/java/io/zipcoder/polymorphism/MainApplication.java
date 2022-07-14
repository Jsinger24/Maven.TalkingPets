package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        List<Pet> listOfPets = new ArrayList<Pet>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many pets do you have? Enter a number here : ");
        Integer numOfPets = userInput.nextInt();
        System.out.println("You have " + numOfPets + " pet(s)!");
        for(int i = 0; i < numOfPets; i++){
            userInput = new Scanner(System.in);
            System.out.println("What type of pet do you have?");
            String type = userInput.nextLine();
            System.out.println("What is your pets name?");
            String name = userInput.nextLine();
            Pet newPet = new Pet(name);
            if (type.equals("cat")) {
                newPet = new Cat(name);
            } else if (type.equals("dog")) {
               newPet = new Dog(name);
            } else if (type.equals("bird")) {
                newPet = new Bird(name);
            }
            listOfPets.add(newPet);

        }

        for(int i = 0; i < listOfPets.size(); i++){
            System.out.println(listOfPets.get(i).getName());
            listOfPets.get(i).speak();
        }
        System.out.println("thanks");


    }



}


