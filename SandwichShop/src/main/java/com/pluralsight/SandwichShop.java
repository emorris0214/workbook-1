package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean regSize = false;
        boolean larSize = false;
        boolean loaded = false;

        System.out.println("Welcome to E's Hoagie's!");
        System.out.print("What size sandwich would you like today? (R/L) ");

        String size = keyboard.nextLine().toUpperCase();

        if (size.equals("R")) {
            regSize = true;
            System.out.println("You have chosen Regular.");
        } else if (size.equals("L")) {
            larSize = true;
            System.out.println("You have chosen Large.");
        } else {
            System.out.println("Invalid input. Please enter 'R' or 'L'.");
            return;
        }

        System.out.print("Would you like your sandwich loaded? (Y/N) ");
        String loadInput = keyboard.nextLine().toUpperCase();
        if (loadInput.equals("Y")) {
            loaded = true;
        }

        System.out.print("How old are you: ");
        int age = keyboard.nextInt();

        float Regular = 5.45f;
        float Large = 8.95f;
        float loadedCharge = 0f;

        if (loaded && regSize) {
            loadedCharge = 1.00f;
        } else if (loaded && larSize) {
            loadedCharge = 1.75f;
        }

        if (age <= 17 && regSize){
            System.out.println("So you're " + age + " and would like a regular hoagie. You receive a 10% discount!");
            System.out.printf("Original price: $%.2f%n", Regular);
            float total = (Regular * 0.90f) + loadedCharge;
            if (loaded) System.out.printf("Loaded charge: $%.2f%n", loadedCharge);
            System.out.printf("Your total now comes to: $%.2f%n", total);
        }
        else if (age <= 17 && larSize){
            System.out.println("So you're " + age + " and would like a large hoagie. You receive a 10% discount!");
            System.out.printf("Original price: $%.2f%n", Large);
            float total = (Large * 0.90f) + loadedCharge;
            if (loaded) System.out.printf("Loaded charge: $%.2f%n", loadedCharge);
            System.out.printf("Your total now comes to: $%.2f%n", total);
        }
        else if (age >= 65 && regSize) {
            System.out.println("So you're " + age + " and would like a regular hoagie. You receive a 20% discount!");
            System.out.printf("Original price: $%.2f%n", Regular);
            float total = (Regular * 0.80f) + loadedCharge;
            if (loaded) System.out.printf("Loaded charge: $%.2f%n", loadedCharge);
            System.out.printf("Your total now comes to: $%.2f%n", total);
        }
        else if (age >= 65 && larSize){
            System.out.println("So you're " + age + " and would like a large hoagie. You receive a 20% discount!");
            System.out.printf("Original price: $%.2f%n", Large);
            float total = (Large * 0.80f) + loadedCharge;
            if (loaded) System.out.printf("Loaded charge: $%.2f%n", loadedCharge);
            System.out.printf("Your total now comes to: $%.2f%n", total);
        }
        else if (regSize) {
            System.out.println("So you're " + age + " and would like a regular hoagie. Sorry, no discount applies.");
            float total = Regular + loadedCharge;
            System.out.printf("Original price: $%.2f%n", Regular);
            if (loaded) System.out.printf("Loaded charge: $%.2f%n", loadedCharge);
            System.out.printf("Your total now comes to: $%.2f%n", total);
        }
        else if (larSize) {
            System.out.println("So you're " + age + " and would like a large hoagie. Sorry, no discount applies.");
            float total = Large + loadedCharge;
            System.out.printf("Original price: $%.2f%n", Large);
            if (loaded) System.out.printf("Loaded charge: $%.2f%n", loadedCharge);
            System.out.printf("Your total now comes to: $%.2f%n", total);
        }

    }
}
