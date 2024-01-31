package mainclass.exercises.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EnterWord {
    public static String exitWord = "close";

    public static void main(String[] args) {
        List<String> enterWord = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        addWord(scanner, enterWord);
        printNonDuplicates(enterWord);
    }

    private static void addWord(Scanner scanner, List<String> input) {
        String word;
        do {
            System.out.println("Please enter word. For exit enter: close");
            word = scanner.nextLine();
            if (!word.equals(exitWord)) input.add(word);
        } while (!word.equals(exitWord));
        scanner.close();
    }

    private static void printNonDuplicates(List<String> values) {
        Set<String> distinctWords = new TreeSet<>(values);
        System.out.printf("%nNonduplicates are: ");
        for (String value : distinctWords) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }
}
