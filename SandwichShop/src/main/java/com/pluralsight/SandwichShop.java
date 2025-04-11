package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean regSize = false;
        boolean larSize = false;

        // R (regular) or L (large)
        System.out.println("Welcome to E's Hoagie's!");
        System.out.print("What size sandwich would you like today? (R/L) ");


        String size = keyboard.nextLine().trim().toUpperCase();
        if (size.equals("R")) {
            regSize = true;
            System.out.println("You have chosen Regular.");
        } else if (size.equals("L")){
            larSize = true;
            System.out.println("You have chosen Large.");
        }
        else {
            System.out.println("Invalid Input. Please enter 'R' or 'L'.");
            return;
        }

    System.out.print("How old are you: ");
        int age = keyboard.nextInt();

        float Regular = 5.45f;
        float Large = 8.95f;

        if (age <= 17 && regSize){
            System.out.println("So you're " + age + " and would like a regular hoagie. You receive a 10% discount!\n");
            System.out.printf("Original price: $%.2f%n", Regular);
            System.out.printf("Your total now comes to: $%.2f%n", Regular * 0.90f);
        }
        else if (age <= 17 && larSize){
            System.out.println("So you're " + age + " and would like a large hoagie. You receive a 10% discount!\n");
            System.out.printf("Original price: $%.2f%n", Large);
            System.out.printf("Your total now comes to: $%.2f%n", Large * 0.90f);

        } else if (age >= 65 && regSize) {
            System.out.println("So you're " + age + " and would like a regular hoagie. You receive a 20% discount!\n");
            System.out.printf("Original price: $%.2f%n", Regular);
            System.out.printf("Your total now comes to: $%.2f%n", Regular * 0.80f);
        } else if (age >= 65 && larSize){
            System.out.println("So you're " + age + " and would like a large since");
            System.out.printf("Original price: $%.2f%n", Large);
            System.out.printf("Your total now comes to: $%.2f%n", Large * 0.80f);
        } else if (regSize) {
            System.out.println("So you're " + age + " and would like a regular hoagie. Sorry, no discount applies.");
            System.out.printf("Total: $%.2f%n", Regular);
        } else if (larSize) {
            System.out.println("So you're " + age + " and would like a large hoagie. Sorry, no discount applies.");
            System.out.printf("Total: $%.2f%n", Large);
        }

    }
}
