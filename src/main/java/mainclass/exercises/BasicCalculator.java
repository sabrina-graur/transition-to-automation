package mainclass.exercises;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter the operator: +, -, *, /");
        char operator = scanner.next().charAt(0);
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("We cannot divide to zero!");
            }
        } else {
            System.out.println("Your input is incorrect");
        }
        System.out.println("Your result is: " + result);
    }
}
