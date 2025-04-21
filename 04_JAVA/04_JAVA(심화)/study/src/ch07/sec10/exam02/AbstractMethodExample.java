package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        System.out.println("===== 매개변수의 다형성 =====");
        System.out.println("----- static 메소드 호출 -----");
        // static 메소드 호출
        animalSound(new Dog());
        animalSound(new Cat());

        System.out.println("----- instance 메소드 호출 -----");
        // 인스턴스 메소드 호출 (static이 아닌 경우)
        AbstractMethodExample example = new AbstractMethodExample();
        example.animalSound1(new Dog());
        example.animalSound1(new Cat());
    }

    // static 메소드: 객체 없이 클래스에서 직접 호출 가능
    public static void animalSound(Animal animal) {
        animal.sound();
    }

    // 인스턴스 메소드: 객체를 생성한 후 호출 가능
    public void animalSound1(Animal animal) {
        animal.sound();
    }
}