package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬랙션 생성
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수: " + hashSet.size()); // 1

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수: " + hashSet.size()); // 2

        Student s3 = new Student(2, "안다윤");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size()); // 3
    }
}