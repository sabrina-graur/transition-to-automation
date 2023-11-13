package mainclass.exercises;

import java.util.Arrays;
import java.util.Random;

public class ArrayElementIncrement {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayNumbers = random.ints(5, 1, 5).toArray();
        int randomIncrement = random.nextInt(0, 5);
        System.out.println("The initial array: ");
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("The random number is:" + randomIncrement);
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] += randomIncrement;
        }
        System.out.println("The array after increment: ");
        System.out.print(Arrays.toString(arrayNumbers));
    }
}
