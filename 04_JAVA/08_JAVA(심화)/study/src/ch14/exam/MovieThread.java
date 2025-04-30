package ch14.exam;

public class MovieThread extends Thread{
    // 스레드 이름 설정
    MovieThread() {
        setName("MovieThread");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println("동영상을 재생합니다,");
            try {Thread.sleep(1000);}
            catch (InterruptedException e) {
                System.out.println("스레드가 인터럽트 되었습니다.");
            }
        }
    }
}
