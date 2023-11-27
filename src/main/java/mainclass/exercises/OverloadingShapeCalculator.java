package mainclass.exercises;

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
        return (radius * radius) * Math.PI;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double a, double b, double c) {
        double semiperimeter = (a + b + c) / 2;
        return Math.sqrt(semiperimeter * ((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)));
    }
}

//Exercise2: Overloading in Java - Shape Calculator
//Create a Java class named ShapeCalculator that demonstrates method overloading for calculating areas of various shapes.
// Implement the following methods:
//1.Method calculateArea that takes the radius of a circle and returns the area.
//2.Method calculateArea that takes the length and width of a rectangle and returns the area.
//3.Method calculateArea that takes the base and height of a triangle and returns the area.
//4.Additionally, create a Main class to test the different overloaded methods from the ShapeCalculator class.
