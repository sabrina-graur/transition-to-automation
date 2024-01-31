package mainclass.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Integer[] digits = {2, 5, 4, 6, 5};
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer digit : digits) {
            if (digit % 2 != 0) {
                oddNumbers.add(digit);
            }
        }
        System.out.println("The list without even: " + oddNumbers);
        System.out.println("Average is: " + calculateAverage(oddNumbers));
    }

    private static double calculateAverage(List<Integer> listOfDigits) {
        double sum = 0;
        for (Integer i : listOfDigits) {
            sum += i;
        }
        return sum / listOfDigits.size();
    }
}
