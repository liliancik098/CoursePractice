package com.homework.lesson5;

import java.util.Scanner;

public class FlotingPointNumber {
    public static void main(String[] args) {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a floating-point number: ");
        number = input.nextDouble();
        System.out.println("Your number is: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0) {
            System.out.println("Negative");
            absoluteValue(number);

        } else {
            System.out.println("Positive");
            absoluteValue(number);
        }
    }
    public static void absoluteValue(double nr) {
        if (nr < 1) {
            System.out.println("Small");
        } else if (nr > 1000000) {
            System.out.println("Large");
        }
    }
}
