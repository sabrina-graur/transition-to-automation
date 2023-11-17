package mainclass.exercises.arrays;

import java.util.Scanner;

public class ArrayCountry {
    public static void main(String[] args) {
        String[] countries = {"Moldova", "Russia", "Italy", "Poland"};
        boolean isFound = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your country: ");
        String country = scanner.nextLine();
        for (String i : countries) {
            if (country.equals(i)) {
                isFound = true;
                break;
            }
        }
        System.out.println("Is the country found in array? " + isFound);
    }
}
