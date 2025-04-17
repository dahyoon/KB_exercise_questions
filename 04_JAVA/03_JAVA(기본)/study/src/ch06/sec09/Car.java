package ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // model 필드는 생성자로 초기화
    Car(String model) {
        this.model = model; // 매개변수를 필드에 대입 (this 생략 불가)
    }
    // speed 필드의 getter/setter 메서드 정의
    public void setSpeed(int speed) {
        this.speed = speed; // 매개변수를 필드에 대입 (this 생략 불가)
    }
    // run() 메서드 호출 시 다음과 같이 출력: xxx(model값)가 달립니다. (시속: yyy(speed값)km/h)
    public void run() {
        this.setSpeed(100); // this 생략 가능
        System.out.printf("%s가 달립니다. (시속: %dkm/h)\n", this.model, this.speed); // this 생략 가능
    }
}
