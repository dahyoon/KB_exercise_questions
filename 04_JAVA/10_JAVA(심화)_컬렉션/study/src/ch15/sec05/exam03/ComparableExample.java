package ch15.sec05.exam03;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Person> people = new ArrayList<Person>();
        // 객체 저장
        people.add(new Person("홍길동", 35));
        people.add(new Person("김자바", 25));
        people.add(new Person("박지원", 31));
        // 정렬 후 순서대로 출력
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.name + ", " + person.age);
        }
        System.out.println();
        // TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();
        // 객체 저장
        treeSet.add(new Person("홍길동", 35));
        treeSet.add(new Person("김자바", 25));
        treeSet.add(new Person("박지원", 31));
        // 정렬 후 순서대로 출력 (TreeSet은 Comparable 인터페이스 구현 시 자동 오름차순 정렬됨)
        for (Person person: treeSet) {
            System.out.println(person.name + ", " + person.age);
        }
    }
}
