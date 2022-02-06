package com.homework.lesson4;

import java.util.Scanner;

public class TexCalculator {
    public static void main(String[] args) {
        double price, tax;
        int quantity;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input price: ");
        price = input.nextDouble();
        System.out.print("Please input tax: ");
        tax = input.nextDouble();
        System.out.print("Please input quantity: ");
        quantity = input.nextInt();
        total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);
    }
}
