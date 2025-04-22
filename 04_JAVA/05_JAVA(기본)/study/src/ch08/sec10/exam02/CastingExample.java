package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle = new Bus();

        // 인터페이스를 토해 호출
        vehicle.run();
        // vehicle.checkFare(); // Vehicle 인터페이스에는 checkFare() 메소드가 정의되지 않아 에러 발생

        // 강제 타입 변환 후 호출
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
