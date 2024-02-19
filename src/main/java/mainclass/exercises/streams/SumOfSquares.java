package mainclass.exercises.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 4, 6, 5, 1, 8);
        int sumOfSquares = numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * e)
                .sum();
        System.out.println("The result = " + sumOfSquares);
    }
}
