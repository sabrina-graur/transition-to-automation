package mainclass.exercises;

public class Overloading {
    public static void main(String[] args) {
        MathOperations operation = new MathOperations();
        System.out.println(operation.sumOperation(5, 6));
        System.out.println(operation.sumOperation(8, 7, 6));
        System.out.println(operation.sumOperation(5.55, 6.66));
        System.out.println(operation.sumOperation(8.99, 7.99, 6.99));
    }
}

class MathOperations {
    public int sumOperation(int a, int b) {
        return a + b;
    }

    public int sumOperation(int a, int b, int c) {
        return sumOperation(a, b) + c;
    }

    public double sumOperation(double a, double b) {
        return a + b;
    }

    public double sumOperation(double a, double b, double c) {
        return sumOperation(a, b) + c;
    }
}
//Exercise1: Overloading in Java
//Create a Java class named MathOperations that demonstrates the concept of method overloading.
// Implement the following methods with different parameter lists in the class:
//1.Method add that takes two integers and returns their sum.
//2.Method add that takes three integers and returns their sum.
//3.Method add that takes two double values and returns their sum.
//4.Method add that takes three double values and returns their sum.
