package tekwill.course.homework.lesson15.util;

import java.util.Scanner;

public class ValidationInput {

    public int validInt(int i){
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public double validDouble(double i){
        if (i < 0) {
            i = 0;
        }
        return i;
    }
}
