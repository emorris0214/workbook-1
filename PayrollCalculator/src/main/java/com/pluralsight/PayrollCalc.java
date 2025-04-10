package com.pluralsight;
import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {

        //created Scanner for User input
        Scanner userInput = new Scanner(System.in);

        // calling scanner for name and storing it
        System.out.print("Enter your name: ");
        String name = userInput.nextLine();

        // calling Scanner for hrs worked and storing it
        System.out.print("Enter how many hours worked this pay period: ");
        float hrsWorked = userInput.nextFloat();

        // calling Scanner for pay rate and storing it
        System.out.print("Enter your pay rate: ");
        float payRate = userInput.nextFloat();

        /* if (hrsWorked > 40) {
            payRate += payRate / 2;
        }
         */

        // calculating gross pay
        float grossPay = hrsWorked * payRate ;

        System.out.println(name + "'s gross pay is: " + grossPay);

    }
}
