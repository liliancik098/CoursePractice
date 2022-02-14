package tekwill.course.homework.lesson8;

public class CopyArray {
    public static void main(String[] args) {
        int[] array1 = {34, 56, 78, 90};
        int[] array2 = new int[array1.length];
        cloneArray(array1, array2);
    }


    static void cloneArray(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array2.length; j++) {
                array2[j] = array1[i];
                System.out.print(array2[j] + " ");
                break;
            }
        }
    }
}
