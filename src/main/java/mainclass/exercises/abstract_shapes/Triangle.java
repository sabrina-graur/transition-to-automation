package mainclass.exercises.abstract_shapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double semiperimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiperimeter * ((semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC)));
    }
}
