package ch14.sec05.exam03;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(2000); // 5초 동안 main 스레드 일시 정지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        workThreadA.work = false;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        workThreadA.work = true;

    }
}
