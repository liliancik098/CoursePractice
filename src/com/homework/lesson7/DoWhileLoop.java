package com.homework.lesson7;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        sumOfTwoNumbers();
    }

    public static void sumOfTwoNumbers() {
        double nr1, nr2, sum;
        String textForExit;
        boolean stop = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter the number: ");
            nr1 = input.nextDouble();
            System.out.println("Thanks!");
            System.out.print("Now, please enter the second number: ");
            nr2 = input.nextDouble();
            sum = nr1 + nr2;
            System.out.println("Sum of " + nr1 + " and " + nr2 + " is = " + sum);
            System.out.println("Would you like to repeat the operation?");
            textForExit = input.next();
            stop = !textForExit.equals("yes");
        } while (!stop);
        {
            System.out.println("Bye bye!");
        }

    }
}
