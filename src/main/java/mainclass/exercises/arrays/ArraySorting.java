package mainclass.exercises.arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 5, 3, 4, 2};
        System.out.println(Arrays.toString(arrayNumbers));
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                int temp = arrayNumbers[i];
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }
        System.out.println("The final array is: " + Arrays.toString(arrayNumbers));
    }
}
