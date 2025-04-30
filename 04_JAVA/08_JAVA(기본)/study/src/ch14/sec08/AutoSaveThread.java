package ch14.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AutoSaveThread extends Thread{
    public void save() {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.printf("[%s] 작업 내용을 저장함\n", now);
    }

    @Override
    public void run() {
        // 1초마다 save() 실행
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            save();
        }
    }
}
