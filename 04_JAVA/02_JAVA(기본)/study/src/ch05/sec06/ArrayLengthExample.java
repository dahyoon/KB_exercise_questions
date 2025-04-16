package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        // 배열 변수 선언 및 대입
        int[] scores = {84, 90,96};

        // 총합
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        // 평균
        double avg = (double) sum / scores.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
