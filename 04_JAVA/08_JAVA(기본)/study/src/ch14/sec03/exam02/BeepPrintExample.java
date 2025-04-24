package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 작업1 :0.5초 간격으로 비프음 출력
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {Thread.sleep(500);} catch (Exception e) {}
                }
            }
        });
        thread.start();
        // 작업2: 0.5초 간격으로 "띵" 문자열 출력 (main 스레드)
        for (int i=0; i < 5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
