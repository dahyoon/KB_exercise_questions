package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성: LinkedList를 큐로 이용
        Queue<Message> queue = new LinkedList<Message>();

        // Message 인스턴스를 다음 순(command, to)로 추가
        // - sendMail, 홍길동
        // - sendSMS, 신용권
        // - sendKakaotalk, 김자바
        queue.offer(new Message ("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "김자바"));

        // 큐가 빌 때까지 큐에서 Message를 추출하며 command에 따라 내용 출력
        while (!queue.isEmpty()) {
            Message msg = queue.poll();
            String command = msg.command;
            switch(command) {
                case "sendMail": command = "메일"; break;
                case "sendSMS": command = "SMS"; break;
                case "sendKakaotalk": command = "카카오톡"; break;
                default: break;
            }
            System.out.printf("%s님에게 %s을(를) 보냅니다.\n", msg.to, command);
        }
    }
}
