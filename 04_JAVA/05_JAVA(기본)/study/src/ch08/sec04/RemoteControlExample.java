package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc; // 자동으로 null 값 대입됨!

        // Television 객체 생성 및 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체 생성 및 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(6);
        rc.turnOff();
    }
}
