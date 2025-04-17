package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //원의 넓이
        double result1 = 10 * 10 * Calculator.pi;
        // 10, 5의 합
        int result2 = Calculator.plus(10, 5);
        // 10, 5의 차
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
