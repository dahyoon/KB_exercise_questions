package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        // 총합
        int sum = 0;
        for (int eachScore: scores) {
            sum += eachScore;
        }
        System.out.println("총합: " + sum);

        // 평균
        double avg = (double) sum / scores.length;
        System.out.println("평균: " + avg);

    }
}
