package Lesson5homework;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is a even!");
        } else
            System.out.println(number + " is odd!");
    }
}
