package tekwill.course.homework.lesson9;

import sun.awt.X11.XInputMethod;

import java.util.Scanner;

public class FindSymbol {
    public static String inputText() {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        text = scanner.next();
        return text;
    }

    public static void findLetterA(String text) {
        int count = 0;
        char[] charArray = text.toCharArray();
        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j] == 'a'){
                count++;
            }
        }
        System.out.print("Number of a's: " + count);
    }

    public static void main(String[] args) {
        String text;
        text = inputText();
        findLetterA(text);
    }


}
