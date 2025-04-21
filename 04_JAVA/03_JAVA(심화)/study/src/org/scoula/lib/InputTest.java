package org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {
        // 이름: 사용자 입력 반환
        String name = Input.read("이름");
        System.out.printf("입력값: %s\n", name);

         // 이름: 사용자가 엔터만 누를 경우 기본값 반환
        name = Input.read("이름", "홍길동");
        System.out.printf("입력값: %s\n", name);
        
        // 나이: 사용자 입력 정수로 변환하여 반환
        int age = Input.readInt("나이");
        System.out.printf("입력값: %d\n", age);
        
        // 종료 여부 확인
        boolean close = Input.confirm("종료할까요?");
        System.out.printf("입력값: %s\n", close);
        
        // 종료 여부 확인: 사용자가 엔터만 누를 경우 기본값 반환
        close = Input.confirm("종료할까요?", true);
        System.out.printf("입력값: %s\n", close);
    }
}
