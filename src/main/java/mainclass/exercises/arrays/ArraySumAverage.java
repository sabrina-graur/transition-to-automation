package mainclass.exercises.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraySumAverage {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayNumbers = random.ints(5, 1, 6).toArray();
        System.out.print("The initial array: ");
        System.out.println(Arrays.toString(arrayNumbers));
        int sum = 0;
        double average;
        for (int arrayNumber : arrayNumbers) {
            sum += arrayNumber;
        }
        average = (double) sum / arrayNumbers.length;
        System.out.println("The sum of the elements is: " + sum);
        System.out.println("The average of the elements is: " + average);
    }
}
