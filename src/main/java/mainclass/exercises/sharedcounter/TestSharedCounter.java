package mainclass.exercises.sharedcounter;

import mainclass.exercises.sharedcounter.SharedCounter;

public class TestSharedCounter {
    public static void main(String[] args) {
        SharedCounter counter1 = new SharedCounter();
        SharedCounter counter2 = new SharedCounter();
        counter1.increment();
        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());
    }
}
