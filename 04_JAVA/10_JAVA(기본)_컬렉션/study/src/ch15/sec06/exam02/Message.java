package ch15.sec06.exam02;

import lombok.AllArgsConstructor; // 전체 매개변수 생성자

@AllArgsConstructor
public class Message {
    public String command;
    public String to;

//    public Message(String command, String to) {
//        this.command = command;
//        this.to = to;
    }
