package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();
        // 객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));
        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("리스트의 총 길이: " + size);
        // 특정 인덱스의 객체 가져오기
        Board board = list.get(2); // 세 번째 요소
        System.out.printf("%s\t%s\t%s\n", board.getSubject(), board.getContent(), board.getWriter());
        // 모든 객체 하나씩 가져오기
        System.out.println("모든 객체 출력: 일반 for문 사용");
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.printf("%s\t%s\t%s\n", b.getSubject(), b.getContent(), b.getWriter());
        }
        System.out.println();
        // 객체 삭제
        list.remove(2); //  리스트에 반영됨, 반환값 없음
        list.remove(2);
        // 향상된 for문으로 모든 객체 하나씩 가져오기
        System.out.println("모든 객체 출력: for-each문 사용");
        for (Board b: list) {
            System.out.printf("%s\t%s\t%s\n", b.getSubject(), b.getContent(), b.getWriter());
        }
    }
}
