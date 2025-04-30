package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        // 현재 실행 중인 스레드의 참조를 얻어 이름을 콘솔에 출력
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");

        for (int i=0; i<3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
            threadA.start();
        }
        Thread chatThread = new Thread("chatThread 처음 이름") {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        System.out.println(chatThread.getName() + " 실행");
        // 작업 스레드의 이름을 setName() 메소드로 수정
        chatThread.setName("chatThread 변경된 이름");
        chatThread.start();
    }
}