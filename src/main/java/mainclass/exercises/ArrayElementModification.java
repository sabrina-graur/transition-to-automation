package mainclass.exercises;

import java.util.Arrays;

public class ArrayElementModification {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                arrayNumbers[i] *= arrayNumbers[i];
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
