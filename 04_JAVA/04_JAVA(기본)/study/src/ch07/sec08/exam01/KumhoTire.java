package ch07.sec08.exam01;

public class KumhoTire extends Tire{
    @Override
    public void roll() {
        // 메소드 재정의 (오버라이딩)
        System.out.println("금호 타이어가 회전합니다.");
    }
}
