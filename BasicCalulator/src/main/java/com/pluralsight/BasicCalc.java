package com.pluralsight;
import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {

        /*Enter the first number: 5
Enter the second number: 12
Possible calculations:
(A)dd
(S)ubtract
(M)ultiply
(D)ivide
Please select an option: M
5 * 12 = 60
*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter your second number: ");
        float num2 = input.nextFloat();

        System.out.println("Possible Calculations: \n" + "(A)dd \n" + "(S)ubtract\n" + "(M)ultiply \n" + "(D)ivision");

        System.out.println("Please choose an option: ");

        String multi = input.next();

        float product = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + "is: " + product);
    }
}
