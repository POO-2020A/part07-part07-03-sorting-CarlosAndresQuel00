
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int min = 9999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int min = 9999;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int min = 9999;
        int pos = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int pos;
        for (int i = 0; i < array.length; i++) {
            pos = indexOfSmallestFrom(array, i);
            swap(array, i, pos);
            System.out.println(Arrays.toString(array));
        }
    }
}
