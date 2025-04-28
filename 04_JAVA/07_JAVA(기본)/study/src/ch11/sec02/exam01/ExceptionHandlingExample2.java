package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // data = null 경우 NullPointerException 발생
            System.out.println(result);
        } catch (NullPointerException e) {
            // 예외 정보를 얻는 방법 3가지
            System.out.println("# 방법1 사용: " + e.getMessage()); // 예외 객체의 메세지로 출력
            System.out.println("# 방법2 사용: " + e.toString());
            System.out.println("# 방법3 사용: ");
            e.printStackTrace(System.out); // 스택 추적 내용 모두 출력, 예외 정보를 표준 출력(System.out)으로 출력
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
