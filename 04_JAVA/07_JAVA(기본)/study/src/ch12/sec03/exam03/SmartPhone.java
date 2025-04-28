package ch12.sec03.exam03;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }
    // Object의 toString() 메소드 재정의: 제조사와 운영체제가 결합된 문자열 반환
    @Override
    public String toString() {
        return company + ", " + os;
    }
}
