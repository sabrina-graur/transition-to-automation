package mainclass.exercises.enums;

public enum Planet {
    MERCURY(1.1), VENUS(2.2), EARTH(7.7), MARS(8.88), JUPITER(11.0), SATURN(12), URANUS(18), NEPTUNE(0.2);
    double gravity;

    Planet(double gravity) {
        this.gravity = gravity;
    }

    double getGravity() {
        return gravity;
    }
}
