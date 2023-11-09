package mainclass.exercises;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 11);
        System.out.println("Note, you have only 3 attempts to guess the number!");
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        do {
            System.out.println("Please, guess the number (between 1 and 10): ");
            int input = scanner.nextInt();
            if (input < 1 || input > 10) {
                System.out.println("The number is not between 1 and 10!");
            } else if (input == randomNumber) {
                System.out.println("You guessed the number. Congratulations!");
                break;
            }
            attempt++;
        } while (attempt < 3);
        System.out.println("The random number was: " + randomNumber);
    }
}
