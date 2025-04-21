package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        // Tire 객체 장착
        myCar.tire = new Tire(); // 이거 안 해주면 에러남
        myCar.run();

        // HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        // KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
