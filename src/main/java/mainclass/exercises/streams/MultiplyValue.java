package mainclass.exercises.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MultiplyValue {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("first number", 9);
        myMap.put("second number", 7);
        myMap.put("third number", 3);
        System.out.println(multiplyValueByKey(myMap, "first number"));
    }
    public static int multiplyValueByKey(Map<String, Integer> myMap, String key){
        return myMap.entrySet()
                .stream()
                .filter(e -> (e.getKey().equals(key)))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getValue() * new Random().nextInt(5);
    }
}
