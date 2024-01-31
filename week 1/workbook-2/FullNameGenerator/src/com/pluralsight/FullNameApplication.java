package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // variables
        Scanner userInput = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String suffix;
        String fullName;

        // input
        System.out.println("Enter your first name: ");
        firstName = userInput.nextLine();
        System.out.println("Enter your middle name: ");
        System.out.println("If you don't have a middle name, please hit enter ");
        middleName = userInput.nextLine();
        System.out.println("Enter your last name: ");
        lastName = userInput.nextLine();
        System.out.println("Enter your suffix if you have one: ");
        suffix = userInput.nextLine();

        fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        fullName = fullName.replace("  ", " ");





        // work


        // output
        System.out.println("Welcome " + fullName);

    }
}
