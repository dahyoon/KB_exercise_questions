package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child child = new Child();
        
        // 자동 타입 변환
        Parent parent = child;
        
        // 메소드 호출
        parent.method1();
        parent.method2();
        // parent.method3(); (잘못된 코드)
        // 이유: Parent 클래스에는 method3가 정의되지 않음
        // 해결 방법: method3는 Child 클래스에 정의되어 있기에 Child 클래스 객체인 child의 메서드로 호출해야됨
        child.method3();
    }
}
