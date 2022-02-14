package tekwill.course.homework.lesson9.areaRectangle;

import java.util.Scanner;

public class Area {
    private int x, y;

    public void setDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return x * y;
    }

}

class Main {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner scanner = new Scanner(System.in);
        int length, width, S;
        System.out.print("Enter the length of rectangle: ");
        length = scanner.nextInt();
        System.out.print("Enter the width of rectangle: ");
        width = scanner.nextInt();
        area.setDim(length, width);
        S = area.getArea();
        System.out.print("Area of rectangle is: " + S);
    }
}
