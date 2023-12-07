package mainclass.generics;

public class TestArrayCounter {
    public static void main(String[] args) {
        ArrayCounter counter = new ArrayCounter();
        String[] stringArray = {"Каша", "в", "голове", "Каша"};
        int[] intArray = {1, 5, 7, 10, 7};
        int casha = counter.countArrayElements(stringArray, "Каша");
        System.out.println(casha);
    }
}
