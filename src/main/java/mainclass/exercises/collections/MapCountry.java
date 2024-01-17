package mainclass.exercises.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCountry {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        createMap(countries);
        displayMap(countries);
    }

    private static void createMap(Map<String, String> countries) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st country and its capital city:");
        addCountry(scanner, countries);
        System.out.println("Please enter 2nd country and its capital city:");
        addCountry(scanner, countries);
        System.out.println("Please enter 3rd country and its capital city:");
        addCountry(scanner, countries);
    }

    private static void addCountry(Scanner scanner, Map<String, String> map) {
        String country = scanner.nextLine();
        String city = scanner.nextLine();
        map.put(country, city);
    }

    private static void displayMap(Map<String, String> countries) {
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("The country " + entry.getKey() + " and its capital " + entry.getValue());
        }
    }
}
