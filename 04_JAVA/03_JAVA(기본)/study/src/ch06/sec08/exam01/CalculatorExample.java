package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main (String[] args) {
        Calculator myCalc = new Calculator(); // Calculator 객체 생성

        myCalc.powerOn(); // return 값이 없는 powerOn() 메소드 호출

        int result1 = myCalc.plus(5, 6);
        System.out.printf("result1: %d\n", result1);

        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.printf("result2: %.1f\n", result2);

        myCalc.powerOff();

    }
}
