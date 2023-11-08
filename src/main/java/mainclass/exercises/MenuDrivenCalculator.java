package mainclass.exercises;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter the operator: +, -, *, /");
        String operator = scanner.next();
        double result = 0;
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("We cannot divide to zero!");
                }
            }
            case "x" -> System.out.println("Operation is stopped");
            default -> System.out.println("Incorrect input!");
        }
        System.out.println("Your result is: " + result);
    }
}
