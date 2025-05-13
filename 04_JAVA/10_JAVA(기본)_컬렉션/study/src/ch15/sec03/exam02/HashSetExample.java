package ch15.sec03.exam02;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member> mySet = new HashSet<>();
        // Member 객체 저장
        mySet.add(new Member("안다윤", 29));
        mySet.add(new Member("안다윤", 29)); // 인스턴스는 다르지만 위와 동등 객체이므로 저장하지 않음
        // 저장된 객체 수 출력
        System.out.println("총 객세 수: " + mySet.size());
    }
}
