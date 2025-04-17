package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        // 객체 생성
        Calculator myCalcu = new Calculator();
        
        // 정사각형의 넓이
        double result1 = myCalcu.areaRectangle(10); // 10(int)는 (double)로 자동 형 변환됨
        
        // 직사각형의 넓이
        double result2 = myCalcu.areaRectangle(10, 20); // 10(int)와 20(int)는 (double)로 자동 형 변환됨
        
        // 출력
        System.out.println("정사각형의 넓이 = " + result1);
        System.out.println("직사각형의 넓이 = " + result2);
    }
}
