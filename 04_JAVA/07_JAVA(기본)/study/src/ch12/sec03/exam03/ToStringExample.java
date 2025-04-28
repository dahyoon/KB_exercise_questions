package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString(); // toString() 메소드 호출
        System.out.println(strObj);

        System.out.println(myPhone); // println() 메서드는 객체 출력 시 자동으로 toString() 메서드 호출함
    }
}
