package mainclass.generics;

import java.util.Arrays;

public class TestListReverser {
    public static void main(String[] args) {
        ListReverser<String> list1 = new ListReverser<>(Arrays.asList("Art box", "Box", "Carnaval"));
        ListReverser<Integer> list2 = new ListReverser<>(Arrays.asList(8, 7, 9));
        ListReverser<Double> list3 = new ListReverser<>(Arrays.asList(7.777, 8.777, 0.777));
        System.out.println(list1.reverseList());
        System.out.println(list2.reverseList());
        System.out.println(list3.reverseList());
    }
}
