package org.scoula.ex05.domain;

public class Member {
    private String name;
    private String userid;

    // 기본 생성자
    public Member() {
    }

    // 생성자 with 파라미터
    public Member(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public String getUserid() {
        return this.userid;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
