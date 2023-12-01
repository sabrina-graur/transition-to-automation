package mainclass.exercises;

public class Planets {
    public static void main(String[] args) {
        Planet earth = Planet.EARTH;
        printPlanetInformation(earth);
    }

    public static void printPlanetInformation(Planet planet) {
        System.out.println("Planet: " + planet);
        System.out.println("Gravity: " + planet.getGravity());
    }
}
