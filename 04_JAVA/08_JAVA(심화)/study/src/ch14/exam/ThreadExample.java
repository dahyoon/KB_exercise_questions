package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        // 스레드 생성
        MovieThread movieThread = new MovieThread();
        MusicRunnable musicRunnable = new MusicRunnable();

        movieThread.start();
        musicRunnable.start();
    }
}
