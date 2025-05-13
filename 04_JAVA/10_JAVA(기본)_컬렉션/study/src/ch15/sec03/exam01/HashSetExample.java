package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬랙션 생성
        Set mySet = new HashSet<>();
        // 객체 저장
        mySet.add("Java");
        mySet.add("JDBC");
        mySet.add("JSP");
        mySet.add("Java"); // 중복 객체이므로 저장 X
        mySet.add("Spring");
        // 저장된 객체 수 출력
        System.out.println("총 객체 수: " + mySet.size());
    }
}
