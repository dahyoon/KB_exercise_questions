package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Board 클래스를 저장하기 위한 LinkedList 인스턴스 생성
        List<Board> boards = new LinkedList<>();
        // Board 클래스의 인스턴스 5개 생성하여 LinkedList에 추가
        for (int i = 1; i <= 5; i++) {
            String subject = "Subject" + i;
            String content = "Content" + i;
            String writer = "Writer" + i;
            Board board = new Board(subject, content, writer);
            boards.add(board);
        }
        // ArrayList에 저장된 요소 개수 출력
        System.out.println("boards 리스트에 저장된 요소 개수: " + boards.size());
        // 3번째 데이터를 추출하여 출력
        Board board = boards.get(2);
        System.out.printf("boards 리스트의 3번째 요소 데이터: (제목: %s), (내용: %s), (작가: %s)\n", board.getSubject(), board.getContent(), board.getWriter());
        // 일반 for문으로 순회하면서 리스트의 각 요소 출력
        for (int i = 0; i < boards.size(); i++) {
            board = boards.get(i);
            String subject = board.getSubject();
            String content = board.getContent();
            String writer = board.getWriter();
            System.out.printf("%d번째 요소 데이터: (제목: %s), (내용: %s), (작가: %s)\n", i+1, subject, content, writer);
        }
        // 인덱스 2에 해당하는 요소 제거
        boards.remove(2);
        System.out.println("인덱스 2 요소 제거 후 boards: " + boards);
        // 제거된 리스트 다시 인덱스 2에 해당하는 요소 제거
        boards.remove(2);
        System.out.println("다시 인덱스 2 요소 제거 후 boards: " + boards);
        // 향상된 for문 (for-each문)으로 순회하면서 리스트의 각 요소 출력
        System.out.println("향상된 for문 사용하기-------");
        int i = 1;
        for (Board b: boards) {
            String subject = b.getSubject();
            String content = b.getContent();
            String writer = b.getWriter();
            System.out.printf("%d번째 요소 데이터: (제목: %s), (내용: %s), (작가: %s)\n", i, subject, content, writer);
            i++;
        }
    }
}
