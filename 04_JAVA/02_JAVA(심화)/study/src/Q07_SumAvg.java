public class Q07_SumAvg {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        // 총 합
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                  sum += array[i][j];
                  count++;
            }
        }
        System.out.printf("총 합: %d\n", sum);

        // 평균
        double avg = (double) sum / count;
        System.out.printf("평균: %.2f\n", avg);
    }
}
