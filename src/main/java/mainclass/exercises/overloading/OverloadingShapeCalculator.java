package mainclass.exercises.overloading;

public class OverloadingShapeCalculator {
    public static void main(String[] args) {
        ShapeCalculator circle = new ShapeCalculator();
        ShapeCalculator rectangle = new ShapeCalculator();
        ShapeCalculator triangle = new ShapeCalculator();
        System.out.println(circle.calculateArea(2));
        System.out.println(rectangle.calculateArea(8.88, 2.22));
        System.out.println(triangle.calculateArea(5, 4, 6));
    }
}

class ShapeCalculator {
    public double calculateArea(double radius) {
        return radius * radius * Math.PI;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double a, double b, double c) {
        double semiperimeter = (a + b + c) / 2;
        return Math.sqrt(semiperimeter * ((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)));
    }
}
