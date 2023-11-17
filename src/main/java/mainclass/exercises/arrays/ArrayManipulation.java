package mainclass.exercises.arrays;

import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(5, 1, 5).toArray();
        int sum = 0;
        int largest = array[0];
        int countEven = 0;

        for (int i : array) {
            System.out.println(i);
        }
        for (int i : array) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        System.out.println("The largest number is: " + largest);
        System.out.println("The number of even elements in the array is: " + countEven);
    }
}
