package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        // 경우 1
        // List<Integer> list = new ArrayList<>();
        // 경우 2
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // 예외 발생 (java.util.NoSuchElementxception)
        // double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        // 방법1 - isPresent()
        OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
        if(optional.isPresent()) {
            System.out.println("방법1 평균 isPresent: " + optional.getAsDouble());
        } else {
            System.out.println("방법1 평균 isPresent: 0.0");
        }

        // 방법2 - orElse()
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("방법2 평균 orElse: " + avg);

        // 방법3 - ifPresent()
        list.stream().mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3 평균 ifPresent(): " + a));
    }
}
