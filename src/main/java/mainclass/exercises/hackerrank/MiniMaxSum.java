package mainclass.exercises.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-555555555, 2, 3, 4, 5, 6, 8965, -5, 10);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> sumValues = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> temp = new ArrayList<>(arr);
            temp.remove(i);
            long sum = temp.stream().mapToLong(Integer::intValue).sum();
            sumValues.add(sum);
        }
        long max = sumValues.stream().max(Long::compareTo).orElseThrow();
        long min = sumValues.stream().min(Long::compareTo).orElseThrow();
        System.out.print(min + " " + max);
    }
}
