package mainclass.exercises.arrays;

public class CheckIdenticalElement {
    public static void main(String[] args) {
        int[] arrayIntegers = {1, 5, 5, 8, 9, 1, 0, 6, 10};
        for (int i = 0; i < arrayIntegers.length - 1; i++) {
            for (int j = i + 1; j < arrayIntegers.length; j++) {
                if (arrayIntegers[j] == arrayIntegers[i]) {
                    System.out.println("The identical numbers are: " + arrayIntegers[i]);
                }
            }
        }
    }
}
