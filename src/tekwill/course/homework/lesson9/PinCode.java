package tekwill.course.homework.lesson9;

import java.util.Scanner;

public class PinCode {

    public static void verifyPin(){
        final int pin  = 45595;
        int count = 0;
        int inputCode;
        boolean CodeVerify = false;
        Scanner scanner = new Scanner(System.in);
        while (count != 3) {
            System.out.print("Enter pin code: ");
            inputCode = scanner.nextInt();
            if (inputCode == pin) {
                System.out.println("Correct, welcome back.");
                CodeVerify = true;
            } else  {
                System.out.println("Incorrect, try again.");
                count++;
            }
        }
        if (!CodeVerify) {
            System.out.println("Sorry but you have been locked out.");
        };
    }

    public static void main(String[] args) {
        verifyPin();
    }
}
