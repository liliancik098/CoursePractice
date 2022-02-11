package com.homework.lesson8;

public class FindValueInArray {
    public static void main(String[] args) {
        int[] array = {23, 2, 6, 7, 2, 5};
        findValue(array, 23);
    }

    static void findValue(int[] array, int value) {
        int count = 0;
        for (int arr : array) {
            if (arr == value) {
                count++;
            }
        }
        System.out.print("The function found value " + value + " in the array " + count + " times");
    }
}
