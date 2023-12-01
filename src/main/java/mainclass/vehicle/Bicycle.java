package mainclass.vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("The bicycle is started");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle is stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("The distance of bicycle is " + distance + " km");
    }
}
