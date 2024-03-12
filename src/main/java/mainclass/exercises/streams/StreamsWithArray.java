package mainclass.exercises.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsWithArray {
    public static void main(String[] args) {
        int[] values = {6, 4, 7, 11};
        long count = Arrays.stream(values).count();
        System.out.println("The count is: " + count);
        int sum = Arrays.stream(values).sum();
        System.out.println("The sum is: " + sum);
        boolean smallerElement = Arrays.stream(values).anyMatch(e -> e < 5);
        System.out.println("Is there element smaller than 10? " + smallerElement);
        boolean element = Arrays.stream(values).allMatch(e -> e < 10);
        System.out.println("Are there all the elements less than 10? " + element);

        String[] names = {"Boris", "Rina", "Michael", "Arina", "Boris"};
        System.out.print("\nThe sorted array: ");
        Arrays.stream(names).sorted().forEach(e -> System.out.printf(e + " "));
        System.out.print("\nThe distinct array: ");
        Arrays.stream(names).distinct().forEach( e -> System.out.print( e + " "));
        System.out.print("\n");
        long result = Arrays.stream(names).filter(e-> e.length() >5).count();
        System.out.println(result + " string(s) have a length greater than 5");
        System.out.print("The names which contains the letter 'a': ");
        Arrays.stream(names).filter(e -> e.contains("a")).forEach( e -> System.out.print( e + " "));
        String fullArray = Arrays.stream(names).collect(Collectors.joining(" "));
        System.out.printf("%nThe full array is: " +fullArray);
        }
    }
