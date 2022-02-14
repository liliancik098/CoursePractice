package tekwill.course.homework.lesson5;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double length1, width1, S1;
        double length2, width2, S2;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the length for first rectangle: ");
        length1 = input.nextDouble();
        System.out.print("Please input the width for first rectangle: ");
        width1 = input.nextDouble();
        System.out.println("Great, now we need to input a length and width for second rectangle. Lets go!");
        System.out.print("Please input the length for second rectangle: ");
        length2 = input.nextDouble();
        System.out.print("Please input the width for second rectangle: ");
        width2 = input.nextDouble();
        S1 = length1 * width1;
        S2 = length2 * width2;
        if (S1 > S2) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("The area of the first rectangle is larger than the area of the second rectangle.");
        } else if (S1 < S2) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("The area of the second rectangle is larger than the area of the first rectangle.");
        } else {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("The area of the first rectangle and the second rectangle are equal");
        }


    }
}
