package com.homework.lesson6;

public class TernaryOperator {
    public static void main(String[] args) {
        ternary(102);
    }

    public static void ternary(int colorCode) {
        String color = colorCode == 100 ? "Yellow" : colorCode == 101 ? "Green" : colorCode == 102 ? "Red" : "Invalid";
        System.out.println("Color ---> " + color);
    }
}
