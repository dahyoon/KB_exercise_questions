package ch14.sec06.exam02;

public class ThreadB extends Thread{
    private WorkObject workObject;

    public ThreadB(WorkObject workObject) {
        setName("ThreadB"); // 스레드 이름 설정
        this.workObject = workObject; // 공유 작업 객체 받음
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB(); // 동기화 메소드 호출
//            System.out.println("b"+i);
        }
    }
}
