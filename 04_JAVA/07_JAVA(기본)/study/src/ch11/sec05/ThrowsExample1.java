package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        // 호출한 곳에서 예외 처리
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("어떤 클래스 이름, 예시 java.lang.String2");
    }
}
