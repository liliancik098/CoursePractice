package tekwill.course.homework.lesson15.util;

import java.util.Scanner;

public class Validation {
    Scanner scanner = new Scanner(System.in);

    public int validInt(int i) {
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public double validDouble(double i) {
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public int validDate(int date) {

        while (date <= 1 || date >= 31) {
            System.out.println("The input should not be <0 and >31");
            scanner.nextLine();
            date = scanner.nextInt();
            break;

        }

        return date;
    }
}
