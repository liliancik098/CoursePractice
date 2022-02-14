package tekwill.course.homework.lesson8;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {24, 45, 12, 75, 32, 55};
        findMinInArray(array);
        findMaxInArray(array);
    }

    static void findMinInArray(int[] array) {
        int length = array.length - 1;
        int min = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = length; j >= i; j--) {
                int temp = Math.min(array[i], array[j]);
                min = Math.min(temp, min);
                length--;
                break;
            }
        }
        System.out.println("The minimum value in array is: " + min);
    }

    static void findMaxInArray(int[] array) {
        int length = array.length - 1;
        int max = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = length; j >= i; j--) {
                int temp = Math.max(array[i], array[j]);
                max = Math.max(temp, max);
                length--;
                break;
            }
        }
        System.out.println("The maximum value in array is: " + max);
    }
}
