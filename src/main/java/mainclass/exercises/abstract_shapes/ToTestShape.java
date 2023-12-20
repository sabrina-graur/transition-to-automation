package mainclass.exercises.abstract_shapes;

public class ToTestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7.77);
        Triangle triangle = new Triangle(3, 2, 3.33);
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
