package ch17.sec08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        // 잘못 작성한 경우
        Arrays.stream(intArr).filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n)); // 최종 처리가 없으므로 미동작
        // 중간 처리 메소드 peek()로 반복 처리
        int total = Arrays.stream(intArr).filter(a -> a % 2 == 0)
                .peek(n-> System.out.println("짝수: " + n)) // 동작
                .sum();
        System.out.println("짝수 총합: " + total + "\n");
        // 최종 처리 메소드 forEach()로 반복 처리
        Arrays.stream(intArr).filter(a -> a%2 == 0)
                // .forEach(System.out::println);
                .forEach(n -> System.out.println(n));

        List<String> names = List.of("Alice", "Bob", "Charlie");

        boolean allStartWithA = names.stream()
                .allMatch(name -> name.startsWith("A")); // Predicate: name -> name.startWith("A")
        System.out.println(allStartWithA); // false

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
    }
}
