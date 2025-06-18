package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("홍길동"); list.add("신영권");
        list.add("감자바"); list.add("신영권");
        list.add("신민철");

        // [1] 중복 요소 제거
        list.stream()               // ★ 소스: list로부터 스트림 생성
                .distinct()        // ★ 중간 연산: 중복 제거
                .forEach(n -> System.out.println(n)); // ★ 최종 연산: 요소 출력
        System.out.println();

        // [2] '신'으로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("신")) // ★ 중간 연산: 조건 필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        // [3] 중복 제거 후, '신'으로 시작하는 요소만 필터링
        list.stream()
                .distinct()                          // ★ 중복 제거
                .filter(n -> n.startsWith("신"))     // ★ 조건 필터링
                .forEach(n -> System.out.println(n));
    }
}