package tekwill.course.homework.lesson8;

import java.util.Scanner;

/**
 * Declare an array of type int. Allocate memory for this array and initialize it with
 * different numeric values. Display array elements on the console.
 * (If you want to make it more complex, you can ask the user to introduce the array
 * length and values)
 * @author Pletosu Lilian
 */


public class ArrayTypeInt {
    public static void main(String[] args) {
        arrayInt();
    }

    public static void arrayInt() {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Please add numbers in array!");

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Your array is complete!");

        for (int array : arr) {
            System.out.print(array + " ");
        }
        reverseElementsInArray(arr);
    }

    public static void reverseElementsInArray(int[] arr) {
        System.out.println();
        System.out.println("Now, we reversed all numbers in your array!");
        for (int j = 0; j < arr.length; j++) {
            int reverse = 0;
            while (arr[j] != 0) {
                int rest = arr[j] % 10;
                reverse = reverse * 10 + rest;
                arr[j] = arr[j] / 10;
            }
            arr[j] = reverse;
            System.out.print(arr[j] + " ");
        }
    }

}