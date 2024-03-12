package mainclass.exercises.hackerrank;

import java.util.*;

class Result {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, -3, 5);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int arrayLength = arr.size();
        double positiveNumbers = arr.stream().filter(e -> e > 0).count();
        double negativeNumbers = arr.stream().filter(e -> e < 0).count();
        double zeroValues = arr.stream().filter(e -> e == 0).count();
        System.out.printf("%.6f", positiveNumbers / arrayLength);
        System.out.printf("%n%.6f", negativeNumbers / arrayLength);
        System.out.printf("%n%.6f", zeroValues / arrayLength);
    }
}
