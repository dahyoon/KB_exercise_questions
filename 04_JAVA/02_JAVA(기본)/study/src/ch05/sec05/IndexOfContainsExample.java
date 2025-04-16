package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        // 프로그래밍의 index 찾기
        int programming_idx = subject.indexOf("프로그래밍");
        System.out.println(programming_idx);
        // "프로그래밍" 출력
//        System.out.println(subject.substring(programming_idx));

        // 자바와 관련된 책인지 판단 - indexOf() 사용
        int java_idx = subject.indexOf("자바");
        if (java_idx != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련된 책이 아니군요.");
        }
        // 자바와 관련된 책인지 판단 - contains() 사용
//        boolean java_flag = subject.contains("자바");
//        if (java_flag) {
//            System.out.println("자바와 관련된 책이군요.");
//        } else {
//            System.out.println("자바와 관련된 책이 아니군요.");
//        }
    }
}
