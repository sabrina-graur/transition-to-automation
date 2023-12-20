package mainclass.exercises.generics;

public class BoxContent {
    public static void main(String[] args) {
        Box<String> artBox = new Box<>("Art box");
        Box<Integer> box1 = new Box<>(1);
        Box<Double> box2 = new Box<>(7.77);
        System.out.println(box2.getValue());
        displayBoxContents(box1);
    }

    public static <T> void displayBoxContents(Box<T> box) {
        System.out.printf("%nThe value is " + box.getValue() + "%nand the type is ");
        System.out.println(box.getValue().getClass().getSimpleName());
    }
}

class Box<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
