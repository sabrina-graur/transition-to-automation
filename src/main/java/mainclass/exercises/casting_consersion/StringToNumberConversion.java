package mainclass.exercises.casting_consersion;

import java.util.Scanner;

public class StringToNumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String value = scanner.nextLine();
        int stringToInt;
        double stringToDouble;
        float stringToFloat;

        try {
            stringToDouble = Double.parseDouble(value);
            stringToFloat = Float.parseFloat(value);
            try {
            stringToInt = Integer.parseInt(value);
            System.out.println("Converted Integer from String: " + stringToInt);
            } catch (Exception ignored) { }
            System.out.println("Converted Double from String: " + stringToDouble);
            System.out.println("Converted Float from String: " + stringToFloat);
        } catch (Exception e) {
            System.out.println("Invalid input!\n" + e);
        } finally {
            scanner.close();
        }
    }
}
