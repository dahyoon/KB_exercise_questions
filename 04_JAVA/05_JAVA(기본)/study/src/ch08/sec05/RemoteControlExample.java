package ch08.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // Television 객체 생성 및 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(7);

        // default 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // Audio 객체 생성 및 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        // default 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
    }
}
