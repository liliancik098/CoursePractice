package com.homework.lesson6;

public class PrintNum {
    public static void main(String[] args) {
        printNumbers1To10();
        printPyramid(5);
    }

    public static void printNumbers1To10() {
        for (int nr = 1; nr <= 10; ++nr) {
            System.out.print(nr + " ");
        }
        System.out.println();
    }

    public static void printPyramid(int rows) {
        System.out.println("------------------------------------------");
        for (int nr = 1; nr <= rows; nr++) {
            for (int j = 1; j <= nr; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}