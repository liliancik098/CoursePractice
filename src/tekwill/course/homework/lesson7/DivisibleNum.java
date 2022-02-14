package tekwill.course.homework.lesson7;

/***
 * Create a program that displays all numbers from 100 to 1,000, ten per
 * line, which are divisible by 5 and 6. The numbers are separated by exactly one
 * space
 * @author Pletosu Lilian
 */

public class DivisibleNum {
    public static void main(String[] args) {
        divisibleBy5And6();
    }

    public static void divisibleBy5And6() {
        int count = 0;
        for (int nr = 100; nr <= 1000; nr++) {
            if (nr % 5 == 0 && nr % 6 == 0) {
                System.out.print(nr + " ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
