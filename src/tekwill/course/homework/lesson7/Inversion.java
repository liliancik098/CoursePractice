package tekwill.course.homework.lesson7;

/**
 * Write a program that prompts user for a positive integer. The program
 * shall read the input as int; and print the "reverse" of the input integer.
 *
 * @author Pletosu Lilian
 */

import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {

        numInversion();

    }

    public static void numInversion() {
        int number, reverse = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the integer number: ");
        number = input.nextInt();
        while (number != 0) {
            int rest = number % 10;
            reverse = reverse * 10 + rest;
            number = number / 10;
        }
        System.out.println("Your reverse number is: " + reverse);
    }
}
