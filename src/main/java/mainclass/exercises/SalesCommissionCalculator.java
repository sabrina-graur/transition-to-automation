package mainclass.exercises;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicate how many items of the first category were sold: ");
        int item1 = scanner.nextInt();
        System.out.println("Indicate how many items of the second category were sold: ");
        int item2 = scanner.nextInt();
        System.out.println("Indicate how many items of the third category were sold: ");
        int item3 = scanner.nextInt();
        System.out.println("Indicate how many items of the fourth category were sold: ");
        int item4 = scanner.nextInt();
        double weeklyGrossSales = calculateGrossSales(item1, item2, item3, item4);
        double weeklySalary = calculateSalary(weeklyGrossSales);
        System.out.println("Employee has the following salary: " + weeklySalary);
    }

    public static double calculateGrossSales(int item1, int item2, int item3, int item4) {
        return (item1 * 239.99) + (item2 * 129.75) + (item3 * 99.95) + (item4 * 350.89);
    }

    public static double calculateSalary(double sum) {
        return 200 + (sum * 0.9);
    }
}
