package mainclass.exercises.overloading;

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
