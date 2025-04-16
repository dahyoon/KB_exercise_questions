package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");

        System.out.printf("번호: %s\n", tokens[0]);
        System.out.printf("제목: %s\n", tokens[1]);
        System.out.printf("내용: %s\n", tokens[2]);
        System.out.printf("성명: %s\n\n", tokens[3]);

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
