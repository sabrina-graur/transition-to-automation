package mainclass.exercises;

public class VariableTypes {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(25);

        System.out.println(circle1.radius);
        System.out.println(circle2.radius);
        System.out.println(Circle.Pi);
        System.out.println(Circle.Pi);
        Circle.Pi = 140;
        System.out.println(Circle.Pi);
        System.out.println(Circle.Pi);
    }
}

  class Circle {

        int radius;
        static double Pi = 3.14159265359;

        public Circle(int i) {
            radius = i;
        }

        public void getInst() {
            int anotherInt = 145;
        }
    }
