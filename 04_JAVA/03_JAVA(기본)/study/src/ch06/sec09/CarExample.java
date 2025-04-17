package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("Jeep");
        Car yourCar = new Car("벤츠");

//        myCar.setSpeed(100);
        myCar.run();

//        yourCar.setSpeed(200);
        yourCar.run();
    }
}
