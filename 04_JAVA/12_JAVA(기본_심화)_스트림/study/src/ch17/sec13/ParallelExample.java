package ch17.sec13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> scores = new ArrayList<>();
        for(int i = 0; i<100000000; i++) {
            scores.add(random.nextInt(101)); // 0~100 사이 난수(랜덤 정수) 생성
        }
        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        Stream<Integer> stream = scores.stream();
        startTime = System.nanoTime();
        avg = stream.mapToInt(i -> i.intValue())
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime; // 105458200ns
        System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");

        Stream<Integer> parallelStream = scores.parallelStream();
        startTime = System.nanoTime();
        avg = parallelStream.mapToInt(i->i.intValue())
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime; // 59050500ns (일반 스트림의 거의 반 값)
        System.out.println("avg: " + avg + ", 병렬 스트림 처리 시간: " + time + "ns");
    }
}
