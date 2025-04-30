package ch14.exam;

public class MusicRunnable extends Thread{
    public MusicRunnable () {
        setName("MusicRunnable");
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("스레드가 인터럽트 되었습니다.");
            }
        }
    }
}
