package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");
        System.out.println(set); // [홍길동, 신용권, 감자바]
        // Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream(); // Stream 객체 얻기
        stream.forEach(name -> System.out.println(name)); // 람다식: 요소 처리 방법
    }
}
