package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = input.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = input.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = input.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = input.nextLine().trim();

        String fullname = "";

        // concatenate non empty variables
        if (!firstName.isEmpty()) {
            fullname = fullname + firstName;
        }
        if (!middleName.isEmpty()) {
            fullname = fullname + " " + middleName;
        }
        if (!lastName.isEmpty()) {
            fullname = fullname + " " + lastName;
        }
        if (!suffix.isEmpty()) {
            // if full name is empty
            if (fullname.isEmpty()) {
                fullname = suffix;
            } else {
                fullname = fullname + ", " + suffix;
            }
        }

        System.out.printf("%nFull name: %s%n", fullname.trim());

    }
}
