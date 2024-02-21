package mainclass.exercises.streams;

import java.util.Arrays;
import java.util.List;

public class IncrementNumber {
    public static void main(String[] args) {
        Integer[] digits = {2, 5, 4, 6, 5, 1, 8};
        List<Integer> numbers = Arrays.asList(digits);
        System.out.print("The initial list:  ");
        numbers.forEach(e -> System.out.print(e + " "));
        System.out.printf("%nThe reworked list: ");
        numbers.stream()
                .map(e -> e % 2 == 0 ? ++e : e)
                .forEach(e -> System.out.print(e + " "));
    }
}
