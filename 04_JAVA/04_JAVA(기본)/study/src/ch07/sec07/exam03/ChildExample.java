package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 변환 (Child -> Parent 타입으로 변환)
        Parent parent = new Child();

        // Parent 타입으로 필드와 메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // 부모 타입에 선언된 필드와 메소드만 사용 가능
        // 즉, 다음과 같이 field2 필드와 method3()는 부모 타입에 선언되지 않아서 호출 불가
        // parent.field2 = "data2"; // 호출 불가
        // parent.method3(); // 호출 불가

        Child child = new Child();
        child.field2 = "data2";
        child.method3();
    }
}
