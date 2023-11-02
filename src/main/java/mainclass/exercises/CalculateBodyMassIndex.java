package mainclass.exercises;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        String messageValue = "Your BMI is: %.1f. The weight status is ";
        if (bmi < 18.5) {
            System.out.printf(messageValue + "underweight.", bmi);
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf(messageValue + "normal.", bmi);
        } else if (bmi >= 24.9 && bmi <= 29.9) {
            System.out.printf(messageValue + "overweight.", bmi);
        } else {
            System.out.printf(messageValue + "obese.", bmi);
        }
        scanner.close();
    }
}
