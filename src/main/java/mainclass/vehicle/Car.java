package mainclass.vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car is started");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("The distance of car is " + distance + " km");
    }
}
