package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        /* 1. Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...") */
        int bobSalary = 100000;
        int garySalary = 97000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("1. The answer is " + highestSalary);

/*2. Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want. */
       float carPrice = 100.9f;
        float truckPrice = 200.8f;
        float minPrice = Math.min(carPrice, truckPrice);
        System.out.println("2. The smallest variable is " + minPrice);


// 3. Find and display the area of a circle whose radius is 7.25
//A = PI*r^2
        float r = 7.25f;
        float Pi = 3.14f;
        float areaOfCircle = r*r * Pi;
        System.out.println("3. The answer is: " + areaOfCircle);
//4. Find and display the square root a variable after it is set to 5.0
        double var = 5.0;
        double sRt = Math.sqrt(var);
        System.out.println("4. The square root of 5.0 is: " + sRt);
//5. Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("5. The distance between the two points are: " + distance);
//6. Find and display the absolute (positive) value of a variable after it is set to -3.8

// 7. Find and display a random number between 0 and 1

    }
}
