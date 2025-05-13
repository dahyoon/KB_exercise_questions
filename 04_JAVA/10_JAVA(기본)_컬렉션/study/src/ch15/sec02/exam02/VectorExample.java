package ch15.sec02.exam02;

import java.util.Vector;
import java.util.List;

import ch15.sec02.exam01.Board;

public class VectorExample {
    public static void main(String[] args) {
        // Vector 컬렉션 생성
//        List<Board> list = new ArrayList<>(); // ArrayList와 Vector 비교
        List<Board> list = new Vector<>();
        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("제목a"+i, "내용a"+i, "글쓴이a"+i));
                }
            }
        };
        // 작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 갹채 1000갸 추가
                for (int i = 0;i < 1000; i++) {
                    list.add(new Board("제목b" + i, "내용b" + i, "글쓴이b" + i));
                }
            }
        };
        // 작업 스레드 실행
        threadA.start();
        threadB.start();
        // 모든 작업 스레드들이 종료될 때까지 메인 스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        } catch(Exception e) {
            e.printStackTrace();
        }
        // 저장된 총 객체 수
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        // 리스트 안에 요소 출력
        for (Board b: list) {
            System.out.println(b.getSubject() + b.getContent() + b.getWriter());
        }
        System.out.println(list);
        System.out.println();
    }
}
