package ch08.sec02;

// RemoteControl 인터페이스를 구현하는 Television 클래그
public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}
