package ch08.sec04;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 
    // - 추상 메소드는 return 타입, 매소드명, (매개변수)만 기술
    // - 구현 클래스가 반드시 재정의해야됨
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
