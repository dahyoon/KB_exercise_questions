package ch14.sec09.exam03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
    public static void main(String[] args) {
        // ExecutorService로 스레드풀 생성 (최대 5개 스레드 담기 가능)
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 계산 작업 생성 및 처리 요청
        for (int i = 1; i <= 10; i++) {
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i = 1; i <= idx; i++) {
                        sum += i;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.printf("[%s] 1~%d합 계산\n", thread.getName(), idx);
                    return sum;
                }
            });
            try {
                int result = future.get(); // Callable의 call() 메소드가 반환한 값
                System.out.printf("\t리턴값: %d\n", result);
            } catch(Exception e) {
                e.printStackTrace(System.out);
            }
        }
        // ExecutorService 종료
        executorService.shutdown();
    }
}
