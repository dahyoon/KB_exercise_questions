package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        // 정수 배열
        int[] arr = {1, 2, 3, 4, 5};

        // count
        long count = Arrays.stream(arr).filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수 개수: " + count); // 2

        // sum
        long sum = Arrays.stream(arr).filter(n -> n%2 ==0)
                .sum();
        System.out.println("2의 베수의 합: " + sum); // 6

        // avg
        double avg = Arrays.stream(arr).filter(n -> n%2 == 0)
                .average().getAsDouble();
        System.out.println("2의 배수의 평균: " + avg); // 3.0

        // max and min
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("최대값: " + max); // 5
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("최소값: " + min); // 1

        // 첫번째 요소
        int first = Arrays.stream(arr).filter(n -> n%3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수: " + first); // 3
    }
}
