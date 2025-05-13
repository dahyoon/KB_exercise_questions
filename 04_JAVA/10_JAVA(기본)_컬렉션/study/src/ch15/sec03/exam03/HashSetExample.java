package ch15.sec03.exam03;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> mySet = new HashSet<>();
        // 객체 추가
        mySet.add("Java");
        mySet.add("JDBC");
        mySet.add("JSP");
        mySet.add("Spring");
        // 객체 하나씩 가져와 처리 - 방법1: Iterator 사용
        Iterator<String> iterator = mySet.iterator();
        while(iterator.hasNext()) {
            // 객체 조회
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                // 가져온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();
        // 객체 제거
        mySet.remove("JDBC");
        // 객체 하나씩 가져와 처리 - 방법2: for-each문 사용
        for(String element : mySet) {
            System.out.println(element);
        }
    }
}
