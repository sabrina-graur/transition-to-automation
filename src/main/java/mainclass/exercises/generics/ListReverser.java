package mainclass.exercises.generics;

import java.util.Collections;
import java.util.List;

public class ListReverser<T> {
    List<T> list;

    ListReverser(List<T> list) {
        this.list = list;
    }

    public List<T> reverseList() {
        Collections.reverse(list);
        return list;
    }
}

