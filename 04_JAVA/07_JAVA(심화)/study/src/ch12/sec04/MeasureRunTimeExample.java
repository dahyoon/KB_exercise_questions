package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time_start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long time_end = System.nanoTime();

        System.out.println("1~1000000까지의 합: " + sum);
        System.out.printf("계산에 소요된 시간: %d (나노초)", (time_end - time_start));
    }
}
