package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {

        // 정수 요소 3개 가지는 정수 배열 arr1 선언 및 생성
        System.out.println("정수 요소 3개 가지는 정수 배열 arr1 선언 및 생성:");
        int[] arr1 = new int[3];
        // for-each 문 사용
        System.out.println("---for-each 사용---");
        int i = 0;
        for (int one: arr1) {
            System.out.printf("arr1[%d]: %d\n",i, one);
            i++;
        }
        // Arrays.toString() 메소드 사용
        System.out.println("---Arrays.toString() 메소드 사용---");
        System.out.println(Arrays.toString(arr1));


        // 문자열 요소 3개 가지는 정수 배열 arr2 선언 및 생성
        System.out.println("\n문자열 요소 3개 가지는 정수 배열 arr2 선언 및 생성:");
        String[] arr2 = new String[3];
        // for-each 문 사용
        System.out.println("---for-each 사용---");
        i = 0;
        for (String  one: arr2) {
            System.out.printf("arr2[%d]: %s\n",i, one);
            i++;
        }
        // Arrays.toString() 메소드 사용
        System.out.println("---Arrays.toString() 메소드 사용---");
        System.out.println(Arrays.toString(arr2));

    }
}
