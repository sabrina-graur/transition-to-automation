package mainclass.exercises.vehicle;

public class ToTestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.start();
        car.drive(5);
        bicycle.stop();
        bicycle.drive(7);
    }
}
