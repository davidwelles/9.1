package com.company;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        System.out.println("Please choose an animal?");
        Scanner input = new Scanner(System.in);
        String soundDog = "bark";
        String soundCat = "meow";
        String soundPig = "oink";
        String sound  = input.nextLine();

        if (sound.equals("Dog")){
            System.out.println(soundDog);
        }else if (sound.equals("Cat")){
            System.out.println(soundCat);
        }else if (sound.equals("Pig")){
            System.out.println(soundPig);
        }else{
            System.out.println("Unknown animal!");
        }

    }
}
