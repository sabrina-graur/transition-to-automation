package mainclass.exercises;

import java.util.Random;

public class FindLargestNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(10, -100, 100).toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
