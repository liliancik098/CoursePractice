package tekwill.course.homework.lesson4;

import java.util.Scanner;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes;
        double days;
        double years;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input minutes: ");
        minutes = input.nextLong();
        days = minutes / 1.440;
        years = minutes * 1.9013E-6;
        System.out.println(minutes + " minutes in days is: " + days);
        System.out.println(minutes + " minutes in years is: " + years);

    }
}
