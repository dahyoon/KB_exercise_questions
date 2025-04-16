package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        for (int i = 0; i < season.length; i++) {
            System.out.printf("season[%d]: %s\n", i, season[i]);
        }
        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int j = 0; j < scores.length; j++) {
            sum += scores[j];
        }
        System.out.printf("\n총합: %d\n", sum);
        double average = (double) sum / scores.length;
        System.out.printf("평균: %.14f", average);
    }
}
