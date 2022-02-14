package tekwill.course.homework.lesson6;

public class Simplify {
    public static void main(String[] args) {
        simplify(8, 37, 10);

    }
    public static void  simplify(int temp, int maxTemp, int minTemp) {
        if (temp > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temp < minTemp) {
            System.out.println("Porridge is too cold.");
        } else if (temp >= minTemp && temp <= maxTemp) {
            System.out.println("Porridge is just right.");
        }
    }
}
