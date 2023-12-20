package mainclass.exercises.sharedcounter;

public class SharedCounter {
    public static int counter = 0;

    public static void increment() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
