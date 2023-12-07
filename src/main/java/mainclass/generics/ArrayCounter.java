package mainclass.generics;

import java.util.Objects;

public class ArrayCounter {

    public <T> int countArrayElements(T[] myArray, T targetElement) {
        int count = 0;
        for (T t : myArray) {
            if (Objects.equals(t, targetElement))
                count++;
        }
        return count;
    }
}
