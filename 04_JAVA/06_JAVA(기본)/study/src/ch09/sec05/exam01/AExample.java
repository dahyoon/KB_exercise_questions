package ch09.sec05.exam01;

public class AExample {
    public static void main(String[] args) {
        A.C c = new A.C();  // C는 정적 클래스이므로 A 인스턴스 없이 바로 생성 가능
                            // C는 정적 클래스이므로, 인스턴스를 만들지 않고도 클래스 이름으로 직접 접근해야됨
        c.method();         // 메소드 호출
    }
}
