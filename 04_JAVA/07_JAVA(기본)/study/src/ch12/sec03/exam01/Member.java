package ch12.sec03.exam01;

public class Member {
    public String id;
    public Member(String id) {
        this.id = id;
    }

    // Object 클래스의 equals() 메소드 재정의
    // obj가 Member 타입인지 검사, 타입 변환 후 target 변수에 대립
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            if(id.equals(target.id)) { // id 문자열이 같은지 비교
                return true;
            }
        }
        return false;
    }
}
