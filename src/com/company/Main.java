package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String firstName = input.nextLine();
        System.out.println("Hello " + firstName);
        System.out.printf("hello %s\n", firstName);

	System.out.println("Hello world!");
	System.out.print("This is from a print method\n");
	//\n adds new line just like println
    }
}
