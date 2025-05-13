package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 갹체 생성
        List<String> listArrayList = new ArrayList<>();
        // LinkedList 컬렉션 갹체 생성
        List<String> listLinkedList = new LinkedList<>();
        // 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;
        // ArrayList 컬렉션에 저장하는 시간
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            listArrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-20s %8d ns \n","ArrayList 걸린 시간: ", (endTime - startTime));
        // LinkedList 컬렉션에 저장하는 시간long startTime;
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            listLinkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-20s %8d ns \n","LinkedList 걸린 시간: ", (endTime - startTime));

    }
}
