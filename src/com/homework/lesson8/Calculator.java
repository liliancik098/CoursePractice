package com.homework.lesson8;

/**
 * Make a Java program that would calculate the sum, average, the number of even
 * and odd elements of an one-dimensional array and a two-dimensional array of type
 * int.
 */
public class Calculator {
    public static void main(String[] args) {
        int[] oneArray = {1, 2, 3, 4, 5};
        int[][] twoArray = {{1, 2, 3, 4}, {4, 5, 4, 4}, {45, 21, 345, 4}};

        oneDimensionalArray(oneArray);
        twoDimensionalArray(twoArray);
    }

    static void oneDimensionalArray(int[] array) {
        int count = 0, sum = 0, countEvenNum = 0, countOddNum = 0;
        for (int arr : array) {
            sum += arr;
            count++;
            if (arr % 2 == 0) {
                countEvenNum++;
            } else countOddNum++;
        }
        System.out.println("The sum of the elements of the one dimensional array is equal to: " + sum);
        System.out.println("The number of even of the one dimensional array is equal to: " + countEvenNum);
        System.out.println("The number of odd of the one dimensional array is equal to: " + countOddNum);
        System.out.println("The average of the one dimensional array is equal to: " + getAverage(sum, count));
        System.out.println("---------------------------------------------------------------------------");
    }

    static void twoDimensionalArray(int[][] array) {
        int count = 0, sum = 0, countEvenNum = 0, countOddNum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                sum += ints[j];
                count++;
                if (ints[j] % 2 == 0) {
                    countEvenNum++;
                } else countOddNum++;
            }
        }
        System.out.println("The sum of the elements of the two dimensional array is equal to: " + sum);
        System.out.println("The number of even of the two dimensional array is equal to: " + countEvenNum);
        System.out.println("The number of odd of the two dimensional array is equal to: " + countOddNum);
        System.out.println("The average of the one dimensional array is equal to: " + getAverage(sum, count));
    }

    static int getAverage(int sum, int arrayLength) {
        return sum / arrayLength;
    }
}
