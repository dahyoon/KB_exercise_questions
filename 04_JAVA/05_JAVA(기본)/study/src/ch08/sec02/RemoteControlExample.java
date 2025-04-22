package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 타입의 변수 선언 (다형성)
        RemoteControl rc;
        // rc에 Television 객체 생성 및 대입 (자동 타입 변환; promotion, upcasting)
        rc = new Television();
        // 인터페이스의 추상 메소드를 구현한 Television의 turnOn() 메소드 실행
        rc.turnOn();

        // rc에 Audio 객체 대입 (교체)
        rc = new Audio();
        // 인터페이스의 추상 메소드를 구현한 Audio의 turnOn() 메소드 실행
        rc.turnOn();
    }
}
